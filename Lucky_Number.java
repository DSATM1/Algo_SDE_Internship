import java.util.*;
public class Lucky_Number 
{
    static void sumOfDigits()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Name : ");
        String name = sc.next();

        System.out.println("Enter Your Date of Birth ( 1 - 31 ) : ");
        int date = sc.nextInt();

        System.out.println("Enter Your Born Month ( 1 - 12 ) : ");
        int month = sc.nextInt();

        System.out.println("Enter Your Born year ( 1990 - 2026 ) : ");
        int year = sc.nextInt();

        int total = date + month + year;
        reduceToSingleDigit(total);
    }

    static void reduceToSingleDigit(int total)
    {
        int single = total % 10;
        total = total / 10;

        if (total > 9)
        {
            reduceToSingleDigit(total);
        }
        getPersonalityReading(total);
        // System.out.println(total);
    }

    static void getPersonalityReading(int total)
    {
        switch(total)
        {
            case 1 : System.out.println("Natural leader — somehow you become the group leader even when nobody asked.");
            break;
            
            case 2 : System.out.println("Peace maker — you avoid arguments so professionally that you sometimes agree with both sides.");
            break;
            
            case 3 : System.out.println("Creative and cheerful — your brain has 37 ideas, but finishing one is another story.");
            break;
            
            case 4 : System.out.println("Practical and organized — even your “random” things probably have a system.");
            break;
            
            case 5 : System.out.println("Adventure lover — routine and you are in a complicated relationship.");
            break;
            
            case 6 : System.out.println("Caring and responsible — everyone comes to you for help, and somehow you say yes.");
            break;
            
            case 7 : System.out.println("Deep thinker — you can turn a simple “okay” message into a 20-minute analysis.");
            break;
            
            case 8 : System.out.println("Ambitious and determined — you see a goal and immediately start calculating how to conquer it.");
            break;
            
            case 9 : System.out.println("Big-hearted and emotional — you remember tiny things people said three years ago.");
            break;

            default : System.out.println("Thank You");

        }

    }

    public static void main(String [] args)
    {
        sumOfDigits();
    }    
}
