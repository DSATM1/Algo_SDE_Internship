import java.util.*;

public class For_Each 
{
    public static void main(String[] suraj)
    {
        // Scanner sc = new Scanner(System.in);
        // int arr[] = {1,2,3,4,5};//new int[5];

        // for(int i = 0; i<= arr.length-1; i++)
        // {
        //     System.out.println(arr[i]);
        //     // System.out.print("Enter your Array Elements for " + arr[i] + " Position : ");
        //     // arr[i] = sc.nextInt();
        // }

        // System.out.print("User Entered Array Elements : ");

        // // int c = 0;
        // for(int Ary : arr)
        // {
        //     System.out.print(Ary);

        //     if(Ary < arr.length)
        //     {
        //         System.out.print(",");
        //     }
        //     Ary++;
        // }


        // int arr[] = {10,20,30,40,50};
        // int sum = 0;
        // for (int i = 0; i<=arr.length - 1; i++)
        // {
        //     sum = sum + arr[i];
        // }
        // System.out.println(sum);

        // int arr[] = {2,3,10,20};
        // int ans = 1;
        // for (int i = 0; i <= arr.length - 1; i++)
        // {
        //     ans = ans * arr[i];
        // }
        // System.out.println(ans);


        // int arr[] = {21,3,-10,20};
        // int max = arr.length;
        // for (int x : arr)
        // {
        //     if (x < max)
        //     {
        //         max = x;
        //     }
        // }
        // System.out.println(max); 

        int arr[] = {1,2,3,4,5};
        int first_max = arr[0];
        int sec_max = arr[0];

        for(int num : arr)
        {
            if (num > first_max)
            {
                sec_max = first_max;
                first_max = num;
            }
        }
        System.out.println(sec_max);

    }
}
