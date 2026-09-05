import java.util.Scanner;

public class Day14_Activity {
    public static void main(String [] args)
    {
                Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number");
        String num=sc.next(); // "127" --> word
        boolean octal = true; // assume that the number is octal 

        for(int i = 0; i <= num.length() - 1; i++)
        {
            char ch = num.charAt(i);

            if (ch < '0' || ch > '7')
            {
                octal = false;
                break;
            }
            
        }
            if(octal)
            {
                System.out.println("Yes radix = 8");
            }
            else
            {
                System.out.println("Not an octal");
            }
        sc.close();
    }
}
