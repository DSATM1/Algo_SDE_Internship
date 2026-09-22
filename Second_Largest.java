public class Second_Largest
{
    static int getSecondLarge(int arr[])
    {
        int First_Highest = arr[0];
        int Second_Highest = arr[0];

        for( int num : arr)
        {
            if(num > First_Highest)
            {
                Second_Highest = First_Highest;
                First_Highest = num;
            }
            
        }
        return Second_Highest;
    }
    public static void main(String[] args)
    {
        int arr[] = {10,15,85,92,100};
        System.out.println(getSecondLarge(arr));
    }    
}
