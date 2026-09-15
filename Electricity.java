import java.util.*;

public class Electricity 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C Name : ");
        String name = sc.next();
        System.out.print("Enter Units Used : ");
        int units = sc.nextInt();

        if (units <= 100)
        {
            units = 100*2;
            System.out.println(units);
        }
        else if( units <= 200)
        {
            units = (100*2) + (units - 100) *3;
            System.out.println(units);
        }
        else if (units <= 300)
        {
            units = (100*2) + (100*3) + (units - 200) * 5;
            System.out.println(units);
        }
        else if( units > 300)
        {
            units = (100*2) + (100*3) + (100*5) + (units - 300) * 7;
            System.out.println(units);
        }
        else
        {
            System.out.println("Not a valid Units");
        }

        int ext_charges = 400;
        int gst = 1000;
        System.out.println("Total BILL  : " + (units + ext_charges + gst));

    }
}
