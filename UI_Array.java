import java.util.*;

public class UI_Array 
{
    public static void main(String[] suraj)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter " + size + " Array Elements : ");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Elements : ");

        for(int num : arr)
        {
            System.out.print(num);

            if( num < arr.length)
            {
                System.out.print(",");
            }
        }
    }    
}
