import java.util.*;

public class Day19_Activity 
{
    // void GCD()
    // {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Number : ");
        // int num_a = sc.nextInt();

    //     System.out.print("Enter the Second Number : ");
    //     int num_b = sc.nextInt();

    //     int original_a = num_a;
    //     int original_b = num_b;

    // while (num_b > 0)
    // {
    //     int common_div = num_a % num_b;
    //     num_a = num_b;
    //     num_b = common_div;
    // }
    // System.out.println("GCD of " + original_a + " and " + original_b + " is " + num_a);
    // sc.close();
    // }

    // static void Student_Info()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Student Name     : ");
    //     String sname = sc.next();

    //     System.out.print("Enter Student Roll Num : ");
    //     int rnum = sc.nextInt();
        
    //     System.out.print("Enter Course Obtained  : ");
    //     String course = sc.next();
        
    //     System.out.print("Enter Semester         : ");
    //     int sem = sc.nextInt();        
        
    //     System.out.print("Enter Academic Year    : ");
    //     int ac_year = sc.nextInt();
        
    //     System.out.println();
        
    //     subjects(sname, rnum, course, sem, ac_year);
        
    // }

    // static void subjects(String sname, int rnum, String course, int sem, int ac_year)
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the Subjects(Min 5) : ");
    //     String sub1 = sc.next();
    //     String sub2 = sc.next();
    //     String sub3 = sc.next();
    //     String sub4 = sc.next();
    //     String sub5 = sc.next();

    //     marks(sub1, sub2, sub3, sub4, sub5, sname, rnum, course, sem, ac_year);
    // }

    // static void marks(String sub1, String sub2,String sub3,String sub4,String sub5, String sname, int rnum, String course, int sem, int ac_year)
    // {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.println("Enter marks for " + sub1 );
    //     int mark1 = sc.nextInt();

    //     System.out.println("Enter marks for " + sub2 );
    //     int mark2 = sc.nextInt();

    //     System.out.println("Enter marks for " + sub3 );
    //     int mark3 = sc.nextInt();

    //     System.out.println("Enter marks for " + sub4 );
    //     int mark4 = sc.nextInt();

    //     System.out.println("Enter marks for " + sub5 );
    //     int mark5 = sc.nextInt();

    //     result_sheet(sname, rnum, course, sem, ac_year, sub1, sub2, sub3, sub4, sub5, mark1,mark2,mark3,mark4,mark5);
    // }

    // static void operations(int mark1, int mark2, int mark3, int mark4, int mark5)
    // {
    //     float total = mark1 + mark2 + mark3 + mark4 + mark5; 
    //     System.out.println("Total Marks : " + total );
        
    //     float perc = (total/500) * 100f;
    //     System.out.println("Percentage  : " + perc);

    //     if(mark1 <= 35 || mark2 < 35 || mark3 < 35  || mark4 < 35 || mark5 < 35) 
    //     {
    //         System.out.println("Grade       : C ");
    //         System.out.println("Result      : Fail ");
    //     }
    //     else if(mark1 <= 50 || mark2 <= 50 || mark3 <= 50  || mark4 <= 50 || mark5 <= 50)
    //     {
    //         System.out.println("Grade       : C+ ");
    //         System.out.println("Result      : Pass ");
    //     }
    //     else if(mark1 <= 75 || mark2 <= 75 || mark3 <= 75  || mark4 <= 75 || mark5 <= 75)
    //     {
    //         System.out.println("Grade       : B ");
    //         System.out.println("Result      : Pass ");
    //     }
    //     else if(mark1 <= 85 || mark2 <= 85 || mark3 <= 85  || mark4 <= 85 || mark5 <= 85)
    //     {
    //         System.out.println("Grade       : A ");
    //         System.out.println("Result      : Pass ");
    //     }
    //     else if(mark1 <= 95 || mark2 <= 95 || mark3 <= 95  || mark4 <= 95 || mark5 <= 95)
    //     {
    //         System.out.println("Grade       : A+ ");
    //         System.out.println("Result      : Pass ");
    //     }
    // }
    
    // static void result_sheet(String sname, int rnum, String course, int sem, int ac_year, String sub1, String sub2, String sub3, String sub4, String sub5, int mark1, int mark2, int mark3, int mark4, int mark5)
    // {
    //     System.out.println("=============================");
    //     System.out.println("|--- STUDENT RESULT CARD ---|");
    //     System.out.println("=============================");   
    //     System.out.println();

    //     System.out.println("Student Name        : " + sname);
    //     System.out.println("Student Roll Number : " + rnum);
    //     System.out.println("Course Obtained     : " + course);
    //     System.out.println("Semester            : " + sem);
    //     System.out.println("Academic Year       : " + ac_year);
    //     System.out.println();
        
    //     System.out.println("=============================");
    //     System.out.println("|- SUBJECTS    <>    MARKS -|");
    //     System.out.println("============================="); 

    //     System.out.println("   " + sub1 + "                 : " + mark1 );
    //     System.out.println("   " + sub2 + "                 : " + mark2 );
    //     System.out.println("   " + sub3 + "                 : " + mark3 );
    //     System.out.println("   " + sub4 + "                 : " + mark4 );
    //     System.out.println("   " + sub5 + "                 : " + mark5 );
    //     System.out.println();

    //     System.out.println("=============================");
    //     System.out.println("|--->>> CERTIFICATION <<<---|");
    //     System.out.println("============================="); 

    //     operations(mark1, mark2, mark3, mark4, mark5);
    //     System.out.println();
    // }
    void main(String[] args)
    {
        // GCD();

        // 1. Check Whether Age is Greater Than 60

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Age : ");
        // byte age = sc.nextByte();
        // if ( age >= 60)
        // {
        //     System.out.println("Senior Citizen");
        // }
        // else
        // {
        //     System.out.println("Not a Senior Citizen");
        // }
        // sc.close();

        // 2. Student Pass/Fail

        // Scanner sc = new Scanner (System.in);
        // System.out.print("Enter Your Marks : ");
        // byte marks = sc.nextByte();
        // if(marks >= 35 && marks <= 100 )
        // {
        //     System.out.println("Pass");
        // }
        // else
        // {
        //     System.out.println("Fail");
        // }
        // sc.close();

        // 3. Bank Loan Eligibility

        // Scanner sc =new Scanner(System.in);
        // System.out.print("Enter Your Age : ");
        // byte age = sc.nextByte();
        // System.out.print("Enter Your Salary : ");
        // long salary = sc.nextLong();
        // if (age >= 21 && salary >= 30000)
        // {
        //     System.out.println("Loan Approved");
        // }
        // else
        // {
        //     System.out.println("Not Approved");
        // }
        // sc.close();

        // 4. User Login

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Name : ");
        // String name = sc.next();
        // System.out.println("Enter Password");
        // String pwd = sc.next();
        // if (name.equals("Suraj") && pwd.equals("1234"))
        // {
        //     System.out.println("Login Successful");
        // }
        // else
        // {
        //     System.out.println("Login Failed");
        // }
        // sc.close();

        // 17. Student Result System

        //Student_Info();
        
    }
}
