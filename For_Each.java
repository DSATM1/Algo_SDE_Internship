import java.util.*;

public class For_Each 
{
    public static void main(String[] suraj)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i = 0; i<= arr.length-1; i++)
        {
            System.out.print("Enter your Array Elements for " + i + " Position : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("User Entered Array Elements : ");

        // int c = 0;
        for(int Ary : arr)
        {
            System.out.print(Ary);

            if(Ary < arr.length)
            {
                System.out.print(",");
            }
            Ary++;
        }
    }
}
