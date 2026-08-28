import java.util.Arrays;

public class Day_9 
{
    static void A()
    {
        B();
    }

    static void B()
    {
        C();
    }

    static void C()
    {
        System.out.println("Hello");
    }
    public static void main(String [] args)
    {
        A();
        
        // int arr[] = new int[5]; // wrong metod
        // System.out.println(arr); // Hashvalue
        // System.out.println(Arrays.toString(arr)); // default value 0 0 0 0 0
        // [I@251a69d7 // I = Array Integer, @ = seperator, rest of them is hashvalues 
        
        // int arr1[] = {10,20,30};
        // System.out.println(arr1); // Hashvalue
        // System.out.println(Arrays.toString(arr1)); // 10 , 20, 30

        // int arr2[] = new int[] {11,5,12};
        // System.out.println(arr2); // Hashvalue
        // System.out.println(Arrays.toString(arr2)); // 10 , 20, 30
        
    }
}
