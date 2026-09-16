import java.util.*;

public class Vowels 
{
    static void english()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character :");
        char ch = sc.charAt(0);

        char c[] = {'a','e','i','o','u'};
        
        for (int i = 0; i <= c[i]; i++)
        {
            if (ch.charAt(0))
            {
                System.out.println("Character Is Vowel");
            }
            else
            {
                System.out.println("Character Is Consonant");
            }
        }
    }
    public static void main(String [] args) 
    {
        english();
    }
}
