import java.util.*;

public class Day_15 
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the F Number : ");
        int num =sc.nextInt();
        // String s = sc.next();
        // System.out.print("Enter the S Number : ");
        // int num2 =sc.nextInt();
        // String s2 = sc.next();

        // int temp = num;
        // int rev = 0;
        // while (num > 0 )
        // {
        //     int digit = num % 10;
        //     rev = rev*10 + digit;
        //     num = num / 10; //0 == 121 ---> fail 
        // }
        // if (temp == rev)
        // {
        //     System.out.println("Is Palindrome");
        // }
        // else
        // {
        //     System.out.println("Is Not Palindrome");
        // }

        // if (num == num2)
        // if (s==s2)
        // {
        //     System.out.println("Is Palindrome");
        // }
        // else
        // {
        //     System.out.println("Is Not Palindrome");
        // }
        
        // while(num>0)
        // {
        //     int digit = num % 10;
        //     num = num /10;
        //     System.out.println("Extracted Number : " + digit);
        //     System.out.println("After Extraction : " + num);            
        // }
        // System.out.println("Hello");

        int count = 0;
        while(num>0)
        {
            //num = num % 10;
            num = num / 10;
            count ++;
        }
        System.out.println(count);

        // int rev = 0;
        // while(num != 0)     // (num < 0 || num > 0)
        // {
        //     int digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num / 10;
        // }

        // System.out.println(rev);

        // for (int i = 1; i <= 3; i++)
        // {
        //     for (int j = 1; j <= 3; j++)
        //     {
        //         System.out.print( "(" + i + " , " + j + ") ");
        //     }
        //     System.out.println( "  ");
        // }

       sc.close();
    }
}
