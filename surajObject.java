import java.util.*;

public class surajObject

//class Suraj 
{
    // Greetings 
    // static void Hello()
    // {
    //     System.out.println("Good Eve Suraj S P");
    // }

    // Smaller Number 
    // static int New_Num(int x , int y)
    // {
    //     if (x < y)
    //     {
    //         return x;
    //     }
    //     else
    //     {
    //         return y;
    //     }
    // }

    // Addition
    // int add(int x, int y)
    // {
    //     return (x+y);
    // }

    // Square of Numbers 
    int Square(int a)
    {
        return a*a;
    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for Square: ");
        int a = sc.nextInt();

        
        surajObject sp = new surajObject();
        
        int s = sp.Square(a);
        System.out.print("Square of " + a + " is " + s);





































        // System.out.print("Enter 1st Number : "); // --------------33333
        // int x = sc.nextInt();
        // System.out.print("Enter 2nd Number : ");
        // int y = sc.nextInt();

        // surajObject sp = new surajObject();

        // int a = sp.add(x, y);
        // System.out.println("Addition of " + x + " and " + y + " is " + a);

        // sp.Hello(); ------- 1111oooooo
        // int n = sp.New_Num(10, 1);
        // System.out.println(n);

        //Hello(); // -------------111111

        //int n = New_Num(5, 10); // -------------22222
        //System.out.println(n);
        sc.close();
    }
}
