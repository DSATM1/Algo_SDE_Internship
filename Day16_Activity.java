import java.util.*;

public class Day16_Activity {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<--- Patterns --->>");
        System.out.println("1. Star Pattern");
        System.out.println("2. Reverse Star");
        System.out.println("3. Number Pattern");
        System.out.println("4. Reverse Number");
        System.out.println("5. Numbers Counter");
        System.out.println("6. Reverse Counter");
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1 : System.out.println("Star Pattern");
            for(int i = 1; i<=5;i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print("*" +" ");
                }
                System.out.println();
            }
            break;

            case 2 : System.out.println("Reverse Pattern");
            for(int i = 1; i<=5;i++)
            {
                for(int j = 1; j<=5-i+1; j++)
                {
                    System.out.print("*" +" ");
                }
                System.out.println();
            }
            break;

            case 3 : System.out.println("Number Pattern");
            for(int i = 1; i<=5;i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    System.out.print(j +" ");
                }
                System.out.println();
            }
            break;

            case 4 : System.out.println("Reverse Number");
            for(int i = 1; i<=5;i++)
            {
                for(int j = 1; j<=5-i+1; j++)
                {
                    System.out.print(j +" ");
                }
                System.out.println();
            }
            break;

            case 5 : System.out.println("Number Counter");
            int count = 0;
            for(int i = 1; i<=5;i++)
            {
                for(int j = 1; j<=i; j++)
                {
                    count++;
                    System.out.print(count+" ");
                }
                System.out.println();
            }
            break;
            
            case 6 : System.out.println("Reverse Counter");
            int count1 = 0;
            for(int i = 1; i<=5;i++)
            {
                for(int j = 1; j<=5-i+1; j++)
                {
                    count1++;
                    System.out.printf("%02d " , count1);
                }
                System.out.println();
            }
            break;

            default : System.out.print("Invalid Choice");
        }
        sc.close();
    }
}
