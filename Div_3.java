public class Div_3 
{
    static void moduloOfThree(int arr[])
    {
        for (int num : arr)
        {
            if(num % 3 == 0)
            {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] suraj)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        moduloOfThree(arr);
    }
}
