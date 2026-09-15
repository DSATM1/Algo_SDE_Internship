import java.util.*;

public class Employee_Salary 
{
    void employee()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Basic Salary : ");
        long basic = sc.nextLong();

        hra(basic);
    }
    static void hra(long basic)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the HRA :");
        long emp_hra = sc.nextLong();

        da(emp_hra, basic);
    }
    static void da(long emp_hra, long basic)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the DA :");
        long emp_da = sc.nextLong();

        gross_salary(emp_da, emp_hra, basic);
    }

    static void gross_salary(long emp_da, long basic, long emp_hra)
    {
        long Gross = basic + emp_hra + emp_da;
        System.out.println("Grossary Salary = " + Gross);
    }

    public static void main(String[] args)
    {
        Employee_Salary obj = new Employee_Salary();
        obj.employee();
    }
}
