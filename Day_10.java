import java.util.*;

public class Day_10 
{
    public static void main(String [] args )
    {
        // Addition of 2 numbers using Scanner Class 
        Scanner sc = new Scanner(System.in);
        //int a,b,c;
        // System.out.print( "Enter the First Number : ");
        // a = sc.nextInt();
        // System.out.print( "Enter the Second Number : ");
        // b = sc.nextInt();
        // c = a + b;
        // System.out.println( "Addition of " + a + " and " + b + " is : " + c);
        
        // Area of Triangle using Scanner Class 
        double h,b,tr ;
        System.out.print( "Enter the Height: ");
        h = sc.nextDouble();
        System.out.print( "Enter the Base: ");
        b = sc.nextDouble();
        tr = 0.5 * h * b;
        System.out.print( "Area of Triangle : " + tr);



    }
}
