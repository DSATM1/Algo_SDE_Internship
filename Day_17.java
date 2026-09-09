public class Day_17 
{
    static int max(int x,int  y) // x = 10, y = 15
    {
        if (x > y)
        {
            return x;
        }
        else
        {
            return y; //return 15
        }
    }
    // static void Name()
    // {
    //     System.out.println("Hello Suraj S P");
    // }
    public static void main(String [] args)
    {
        int a = 10, b = 15;
        //Name();
        int c = max(a, b);
        System.out.println(c);
    }
}
