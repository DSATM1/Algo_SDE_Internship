public class Type_of_Numbers 
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,-3,-1,-0,0,12,0,2,-45};
        int count = 0;
        int positive = 0;
        int negative = 0;

        for(int num : arr)
        {
            if (num > 0)
            {
                count += 1;
            }
            else if (num < 0 )
            {
                count += 1;
                
            }
        }
        System.out.println(count);
    } 
}
