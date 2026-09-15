import java.util.*;

public class Login 
{
    static void name(String pin)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User Name");
        String user_name = sc.next();

        if(user_name.equals("Suraj"))
        {
            System.out.println("Login Succefull");
        }
        else
        {
            System.out.println("NOT a valid username");
        }
    }
    static void pinattempt()
    {
        Scanner sc = new Scanner(System.in);
        int att = 1;
        String pin = "";
        for (int i = 3; i>=att; i--)
        {
            System.out.print("Enter Your Pin : ");
            pin = sc.next();

            if (pin.equals("1234") && pin.length() == 4)
            {
                name(pin);
                return;
            }
            else
            {
                System.out.println(i + " Attempts left ");
            }
        }
        System.out.println(" User Account is Locked ");
    }

    public static void main(String[] args)
    {
            pinattempt();
    }
}
