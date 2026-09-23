public class RepeatNumbers 
{
    static int repeatedKey(int arr[], int key)
    {
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if( arr[i] == key)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {20,30,40,10,20,20,30,20};
        int key = 20;
        int n = repeatedKey(arr, key);
        System.out.println(n);
        
    }   
}
