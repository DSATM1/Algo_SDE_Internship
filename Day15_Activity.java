import java.util.*;

public class Day15_Activity {
    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        // // Reverse a number 
        // long rev = 0;
        // while(n > 0)
        // {
        //     long digit = n % 10;
        //     n = n / 10;
        //     rev = rev * 10 + digit;
        // }
        // System.out.println(rev);

        using for loop ---->>>>>>
        int rev = 0;
        for (int i = rev; )
        {
            int digit = n % 10;
            n = n/ 10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);

        palindrome 
        int temp = num;
        int rev = 0;
        while (num > 0 )
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10; //0 == 121 ---> fail 
        }
        if (temp == rev)
        {
            System.out.println("Is Palindrome");
        }
        else
        {
            System.out.println("Is Not Palindrome");
        }

        for (int i= 1; i<=10; i++)
        {
            if(i == 5)
                break;
            System.out.println(i);
        }

        sc.close();
    }
}
