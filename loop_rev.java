import java.util.*;

public class loop_rev 
{
    static void reverse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int i = 0; i<num; i--)
        {
            System.out.print(i);
        }
    }
    public static void main(String[] args)
    {
        reverse();
    }    
}
// digit = num % 10;
// num = num / 10;
// System.out.println(digit);
