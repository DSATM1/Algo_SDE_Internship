import java.util.Scanner;

public class Swaroop_Lucky 
{

    void SumOfDigits(int Day, int Month, int Year, String name)
    {

        // Adding all the Numbers
        int Total = Day + Month + Year; // 2029

        // getting the First Digit
        int Digit_1 = Total / 1000; 

        // getting the 2nd digit
        int Digit_2 = (Total / 100 ) % 10;

        // getting the 3rd Digit 
        int Digit_3 = (Total / 10) % 10;

        // getting the last Digit
        int Digit_4 = Total % 10;

        int Total2 = Digit_1 + Digit_2 + Digit_3 + Digit_4;

        ToSingleDigits(Total2, name);

    }

    void ToSingleDigits(int Total2,String name)
    {

        if(Total2 > 9)
        {
            SumOfDigitsP2(Total2, name);
        }
        else
        {
            NAME(name, Total2);
            PersonalityReading(Total2,name);
        }
    }

    void SumOfDigitsP2(int Total2, String name)
    {
        int Single = Total2 % 10;
        Total2 = Total2 / 10;
        ToSingleDigits(Total2, name);
    }
    void PersonalityReading(int Total2,String name)
    {
        switch(Total2)
        {
            case 1:
                System.out.println(" 1--> Bro, even your number has no backup.");
                break;
            
            case 2:
                System.out.println(" 2--> Still can't find a third person to complete the group.");
                break;

            case 3:
                System.out.println(" 3--> Bro thinks he's a crowd.");
                break;

            case 4:
                System.out.println(" 4--> That's not a number, that's your IQ after lunch.");
                break;

            case 5:
                System.out.println(" 5--> Halfway to 10, just like your brain is halfway to understanding.");
                break;

            case 6:
                System.out.println(" 6--> Bro has been counting since kindergarten.");
                break;
            
            case 7:
                System.out.println(" 7--> Lucky number. Too bad you're not.");
                break;
            
            case 8:
                System.out.println(" 8--> Bro is one zero away from becoming successful.");
                break;
            
            case 9:
                System.out.println(" 9--> So close to 10, yet somehow still disappointing.");
                break;

            default : System.out.println("Thank You Bye");
        }
    }

    void NAME(String name, int Total2)
    {
        System.out.println(" Hey " + name + " Your Lucky Number is : " + Total2);
    }

    public static void main(String[] args) 
    {
        int Total2 = 0;

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = obj.next();

        System.out.print("Enter Your BirthDay (1 - 31): ");
        int Day = obj.nextInt();

        System.out.print("Enter Your Birth Month (1 - 12): ");
        int Month = obj.nextInt();

        System.out.print("Enter Your BirthYear : ");
        int Year = obj.nextInt();

        Swaroop_Lucky obj2 = new Swaroop_Lucky();
        obj2.SumOfDigits(Day, Month, Year, name);
        // obj2.NAME(name, Total2);
    }
}
