import java.util.*;

public class User_Input_array 
{
    // int userInput(int arr[])
    // {
    //     for (int x : arr)
    //     {
    //         return arr;
    //     }
    // }

    public static void main(String[] suraj)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter " + size + " Elements : ");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);

        // User_Input_array obj = new User_Input_array();
        // obj.userInput(arr);

    }
}


