import java.util.*;

public class Mini_calc 
{
    static void Addition()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        byte add1 = sc.nextByte();

        System.out.print("Enter Second Number : ");
        byte add2 = sc.nextByte();

        System.out.println("Addition of " + add1 + " and " + add2 + " is " + (add1+add2));
    }

    static void Substraction()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        byte sub1 = sc.nextByte();

        System.out.print("Enter Second Number : ");
        byte sub2 = sc.nextByte();

        System.out.println("Addition of " + sub1 + " and " + sub2 + " is " + (sub1-sub2));
    }

    static void Multi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        byte mul1 = sc.nextByte();

        System.out.print("Enter Second Number : ");
        byte mul2 = sc.nextByte();

        System.out.println("Addition of " + mul1 + " and " + mul2 + " is " + (mul1*mul2));
    }

    static void Division()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        byte div1 = sc.nextByte();

        System.out.print("Enter Second Number : ");
        byte div2 = sc.nextByte();

        System.out.println("Addition of " + div1 + " and " + div2 + " is " + (div1/div2));
    }

    static void Modulos()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        byte mod1 = sc.nextByte();

        System.out.print("Enter Second Number : ");
        byte mod2 = sc.nextByte();

        System.out.println("Addition of " + mod1 + " and " + mod2 + " is " + (mod1%mod2));
    }

    static void Exit()
    {
        System.out.println("Thank you for using ");
    }

    static void method()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ---- MINI Calculator ----");
        System.out.println("1. Addition ");
        System.out.println("2. Substraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Modulos ");
        System.out.println("6. Exit ");
        System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1 : Addition();
            break;

            case 2 : Substraction();
            break;

            case 3 : Multi();
            break;

            case 4 : Division();
            break;

            case 5 : Modulos();
            break;

            case 6 : Exit();
            break;

            default : System.out.println("Invalid Choice Bye Bye ");
        }
    }
    public static void main(String[] args)
    {
        method();
    }     
}
