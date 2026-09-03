// Type Promotions : Automatic conversion of smaller data type to larger data type by java before performing an operation

// Golden Rules :
// 1. Byte short and char are always promoted to int before arithmetic operation
// 2. If operands are of different types, java promotes the smaller type to the widest type in the expression 
// 3. The result of the expression is of that promoted type


public class Day_8 
{
    public static void main(String[] args)
    {
        // Demo for byte and byte

        // byte a = 10;
        // byte b = 20;
        // byte c = a+b; ---> Wrong, lossy conversion
        // byte c = (byte)(a+b); //Type conversion
        // System.out.println(c);

        // Demo for byte and short 

        // byte a = 10;
        // short b = 20;
        // short c = (byte)(a+b);
        // System.out.println(c);

        // char and int 

        // char a1 = 10;
        // char b1 = 40;
        // int c1 = a1 + b1;
        // System.out.println(c1);

        // int and long 

        // int l1 = 23;
        // long l2 = 1987123;
        // // int l3 = l1+l2; --> wrong lossy conversion 
        // long l4 = l1+l2; // Type Promotion
        // System.out.println(l4);

        // short and long 

        // short s1 = 12;
        // long l1 = 87654;
        // long l2 = s1 * l1;
        // System.out.println(l2);

        // Short and char

        // short s = 12;
        // char c = 34;
        // int ch = s + c;
        // System.out.print(ch);
        
        // int and long 
        
        // int f = 32;
        // long l = 43215;
        // long lf = f*l;
        // System.out.print(lf);

        //long and float 

        // long l = 54321;
        // float f = 8.90f;
        // long fl = l + f;
        
        //float and double 

        // int x = 10;
        // int y = 20;
        // int z = x+y;
        // String str =  new String ("Sum : "+z);  // str = referance variable 
        // System.out.println(str+z);

        long time = System.currentTimeMillis(); // native method()
        System.out.println("Cueent Time : "+time);







    }
}
