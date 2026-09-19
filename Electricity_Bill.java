import java.util.*;

public class Electricity_Bill 
{
    static int getElectricity(int units, int price)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the units : ");
        units = sc.nextInt();

        System.out.println("Enter the Price per units : ");
        price = sc.nextInt();

        int bill = units * price;

        System.out.println(bill);
        return bill;



    }
    public static void main(String [] args)
    {
        getElectricity(0,0);
        
    }
}
