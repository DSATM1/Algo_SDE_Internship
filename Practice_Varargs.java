public class Practice_Varargs 
{
    static int EvenCount(int ... nums)
    {
        int count = 0;
        for( int n : nums)
        {
            if( n % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String [] suraj)
    {
        int arr = EvenCount();
        System.out.println("Count of Even Numbers : " + EvenCount( 10,15,20,25,30));
    }
}
