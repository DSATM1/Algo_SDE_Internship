import java.util.Arrays;

public class Day_9 
{
    // static void A()
    // {
    //     B();
    // }

    // static void B()
    // {
    //     C();
    // }

    // static void C()
    // {
    //     System.out.println("Hello");
    // }
    public static void main(String [] args)
    {
        // A();

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

        byte a = 10;
        byte b = 20;

        boolean x = true;
        boolean y = false;

        // System.out.println(x+y); // in java true is true only not return anything

        System.out.println("A is : " + a);
        System.out.println("B is : " + b);
        System.out.println();

        System.out.println("Addition : " + (a+b));
        System.out.println("Substraction : " + (a-b));
        System.out.println("Product : " + (a*b));        
        System.out.println("Division : " + (b/a));
        System.out.println("Modulos : " + (a%b)); 
        System.out.println();


        System.out.println("Eq 1 : " + (a*(b/2)+3));
        System.out.println("Eq 2 : " + (10+5*2));
        System.out.println("Eq 3 : " + ((10+5)*2));
        System.out.println("Eq 4 : " + (20-5+2));
        System.out.println("Eq 5 : " + (20-(5+2)));
        System.out.println();

        --a;
        System.out.println("--a : " + a);
        a--;
        System.out.println("a-- : " + a);
        ++a;
        System.out.println("++a : " + a);
        a++;
        System.out.println("a++ : " + a);
        b--;
        System.out.println("b-- : " + b);
        --b;
        System.out.println("--b : " + b);
        ++b;
        System.out.println("++b : " + b);
        b++;
        System.out.println("b++ : " + b);
        System.out.println();
        
        System.out.println(a++ + ++a);
        System.out.println(a++ + ++b);
        System.out.println();

        System.out.println(20.5/3.5);
        System.out.println();


        double num = 8.1;
        int inte = (int) num;
        double f = num - inte;
        

        System.out.println(Integer.toBinaryString((int) num));
    }
}
