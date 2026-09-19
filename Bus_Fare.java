import java.util.*;

public class Bus_Fare 
{
    static void getBusFare(int age, float kilo)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age : ");
        age = sc.nextInt();

        System.out.println("Enter Travelled Distance in KM : ");
        kilo = sc.nextFloat();


        int Board = 10;
        int fare = Board + (int)(kilo*2);

        if(age > 0 && age <= 100 && kilo > 0)
        {
            if (age >= 60)
            {
                fare = fare/2;
                System.out.println("The Passanger is Seniour Citizen ");
                System.out.println("Fare is : " + fare);
            }
            else
            {
                System.out.println("Not a Seniour Citizen ");
                System.out.println("Fare is : " + fare);
            }
        }
        else
        {
            System.out.println("Not a valid Age  or Distance !!!! ");
        }



    }

    public static void main(String [] args)
    {
        getBusFare(0, 0);
    }    
}
