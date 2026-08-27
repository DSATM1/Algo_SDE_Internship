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

        // char and char
        // char a1 = 10;
        // char b1 = 40;
        // int c1 = a1 + b1;
        // System.out.println(c1);
    }
}
