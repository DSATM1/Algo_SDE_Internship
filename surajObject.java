import java.util.*;

public class surajObject

//class Suraj 
{
    // Greetings -----11111 
    // static void Hello()
    // {
    //     System.out.println("Good Eve Suraj S P");
    // }

    // Smaller Number  ------222222
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

    // Addition ---------33333333
    // int add(int x, int y)
    // {
    //     return (x+y);
    // }

    // Square of Numbers  -------44444444
    // int Square(int a)
    // {
    //     return a*a;
    // }

    // Even or Odd --------5555555555
    // String evenodd(int x)
    // {
    //     if ( x % 2 == 0)
    //     {
    //         return "Even";
    //     }
    //     else
    //     {
    //         return "Odd";
    //     }
    // }

    // Max of 3 numbers 

    int max3(int a, int b, int c)
    {
        if ( a > b && a > c)
        {
            return a;
        } 
        else if (b > a && b > c)
        {
            return b;
            
        }
        else
        {
            return c;
        }
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A :");
        int a = sc.nextInt();
        System.out.print("Enter number B :");
        int b = sc.nextInt();
        System.out.print("Enter number C :");
        int c = sc.nextInt();

        surajObject big = new surajObject();
        int n = big.max3(a, b, c);
        System.out.println(n);





        
        
        
        

        
        
        
        

        
        
        
        
        
        

        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
        


        
        
        
        
        
        

        


        
        
        
        
        
        
        
        
        // Hello(); // -------------111111



        // sp.Hello(); ------- 1111oooooo
        // int n = sp.New_Num(10, 1);
        // System.out.println(n);



        //int n = New_Num(5, 10); // -------------22222
        //System.out.println(n);



        // System.out.print("Enter 1st Number : "); // --------------33333
        // int x = sc.nextInt();
        // System.out.print("Enter 2nd Number : ");
        // int y = sc.nextInt();
        // surajObject sp = new surajObject();
        // int a = sp.add(x, y);
        // System.out.println("Addition of " + x + " and " + y + " is " + a);



        // System.out.print("Enter the Number for Square: "); // -----444444
        // int a = sc.nextInt();
        // surajObject sp = new surajObject();
        // int s = sp.Square(a);
        // System.out.print("Square of " + a + " is " + s);



        // System.out.print("Enter a number to find Even or Odd : "); ----- 5555555
        // int x = sc.nextInt();
        // surajObject sp = new surajObject();
        // String s = sp.evenodd(x);
        // System.out.println("Number is " + s);



        sc.close();
    }
}
