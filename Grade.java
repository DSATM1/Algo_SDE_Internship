import java.util.*;

public class Grade 
{
    static char checkGrade(int marks)
    {
        if(marks >= 80)
        {
            return 'A';
        }
        else if(marks >= 65)
        {
            return 'B';
        }
        else if(marks >= 35)
        {
            return 'C';
        }
        else
        {
            return 'F';
        }
    } 

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your marks : ");
        int marks = sc.nextInt();

        char grade = checkGrade(marks);

        System.out.println("Your Grade is : " + grade);
    }    
}