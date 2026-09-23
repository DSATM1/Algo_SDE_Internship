public class Varargs 
{
    static void show(int x, int...a)
    {
        System.out.println("Args");

        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]);
            if(i != a.length - 1)
            {
                System.out.print(",");
            }
        }
    }    

    /*s tatic void show(int a)
    {
        System.out.println("One Args");
    }

    static void show(int a, int b)
    {
        System.out.println("Two Args");
    } */

    public static void main(String[] suraj)
    {
        show(10,20,30,40);
        // show(15);
        // show(15,16);
    }
}

