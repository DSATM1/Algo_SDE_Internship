import java.util.*;

public class Voting 
{
    static void isEligibleToVote(int age)
    {
        while(true)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age : ");
            age = sc.nextInt();

            if(age >= 18)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
    public static void main(String [] args)
    {
        int age = 0;
        isEligibleToVote(age);
    }    
}
