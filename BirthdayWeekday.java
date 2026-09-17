import java.util.*;

/**
 * Game 7: Which Day Were You Born?
 *
 * Uses Zeller's congruence - a formula made only of +, *, / and % - to find
 * the weekday of any date, then prints a joke for that weekday and tells the
 * user which weekday their birthday falls on this year.
 *
 * Concepts: integer arithmetic, if-else, arrays, switch, methods.
 */
public class BirthdayWeekday {

    // ---------- Constants ----------

    /** Weekday names in the order Zeller's formula produces them: 0 = Saturday. */
    private static final String[] WEEKDAY_NAMES = {
            "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
    };

    private static final int SATURDAY = 0;
    private static final int SUNDAY = 1;
    private static final int MONDAY = 2;
    private static final int TUESDAY = 3;
    private static final int WEDNESDAY = 4;
    private static final int THURSDAY = 5;
    private static final int FRIDAY = 6;

    private static final int CURRENT_YEAR = 2026;
    private static final int MIN_YEAR = 1900;

    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int FEBRUARY = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read a real date (year first, so the day limit can depend on month and year)
        int year = readNumberInRange(scanner, "Enter your birth year (" + MIN_YEAR + "-" + CURRENT_YEAR + "): ", MIN_YEAR, CURRENT_YEAR);
        int month = readNumberInRange(scanner, "Enter your birth month (1-12): ", 1, 12);
        int maxDay = getDaysInMonth(month, year);
        int day = readNumberInRange(scanner, "Enter your birth day (1-" + maxDay + "): ", 1, maxDay);

        // Step 2: Work out the weekdays
        int birthWeekday = calculateWeekday(day, month, year);
        int birthdayWeekdayThisYear = calculateWeekday(day, month, CURRENT_YEAR);

        // Step 3: Print the results
        System.out.println();
        System.out.println("You were born on a " + WEEKDAY_NAMES[birthWeekday] + "!");
        System.out.println(getWeekdayJoke(birthWeekday));
        System.out.println("This year your birthday falls on a " + WEEKDAY_NAMES[birthdayWeekdayThisYear] + ".");

        scanner.close();
    }

    // ==================== Input helpers ====================

    private static int readNumberInRange(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (!isWholeNumber(input)) {
                System.out.println("'" + input + "' is not a number. Please enter digits only.");
                continue;
            }

            int value = Integer.parseInt(input);
            if (value < min || value > max) {
                System.out.println("Please enter a value between " + min + " and " + max + ".");
                continue;
            }

            return value;
        }
    }

    private static boolean isWholeNumber(String text) {
        if (text.isEmpty()) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character < '0' || character > '9') {
                return false;
            }
        }
        return true;
    }

    // ==================== Calendar logic ====================

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    private static int getDaysInMonth(int month, int year) {
        int days = DAYS_IN_MONTH[month - 1];
        if (month == FEBRUARY && isLeapYear(year)) {
            days = days + 1;
        }
        return days;
    }

    /**
     * Zeller's congruence. Returns 0 for Saturday, 1 for Sunday ... 6 for Friday.
     *
     * The formula treats January and February as months 13 and 14 of the
     * previous year, so that the leap day (end of February) is always the
     * last day of the "formula year".
     */
    private static int calculateWeekday(int day, int month, int year) {
        int formulaMonth = month;
        int formulaYear = year;

        if (month == 1 || month == 2) {
            formulaMonth = month + 12;
            formulaYear = year - 1;
        }

        int yearOfCentury = formulaYear % 100;   // e.g. 1982 -> 82
        int century = formulaYear / 100;         // e.g. 1982 -> 19

        int monthTerm = (13 * (formulaMonth + 1)) / 5;
        int yearTerm = yearOfCentury + (yearOfCentury / 4);
        int centuryTerm = (century / 4) + (5 * century);

        return (day + monthTerm + yearTerm + centuryTerm) % 7;
    }

    // ==================== Output ====================

    private static String getWeekdayJoke(int weekday) {
        switch (weekday) {
            case SATURDAY:
                return "Saturday baby: born on a holiday, still living like it is one.";
            case SUNDAY:
                return "Sunday baby: chill by default. Deadlines are a rumour to you.";
            case MONDAY:
                return "Monday baby: you have had Monday blues since Day 1. Literally.";
            case TUESDAY:
                return "Tuesday baby: forgettable day, unforgettable person. (Say it back.)";
            case WEDNESDAY:
                return "Wednesday baby: mid-week, mid-bench, mid-attendance. Balanced.";
            case THURSDAY:
                return "Thursday baby: almost the weekend, almost topper, almost on time.";
            case FRIDAY:
                return "Friday baby: the party started when you arrived. Still going.";
            default:
                return "That weekday does not exist. Impressive.";
        }
    }
}
