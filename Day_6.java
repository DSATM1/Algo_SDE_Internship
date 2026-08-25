public class Day_6 
{    
        // static byte a;
        // static int num;
        // static short s;
        // static long l;
        // static float f;
        // static char c;
        // static double d;
        // static boolean b;
    public static void main(String[] args)
    {
        /*why variable even though we can print values directly 
        bcz for future use if i want change data then i can't 
        change all the 100 entries if there are 100 entries so we need variable 
        */
        // System.out.println(25);
        // System.out.println(3.14);
        // System.out.println(3.143224);
        // System.out.println(true);
        // System.out.println('A'); // char will store only one value
        // System.out.println("Suraj");
        // System.out.println("null"); // null should be in double quots

        // variable concept 
        // byte age = 26;
        // System.out.println(age);
        // System.out.println(age);
        // System.out.println(age);
        // System.out.println(age);
        // System.out.println(age);

        // Integral type represented in different types
        // byte b1 = 10; // Decimal Value 
        // byte b2 = 0b1010; // Binary Value 
        // byte b3 = 012; // Octal Value
        // byte b4 = 0xA; // Hexadecimal Value

        // System.out.println(b1);
        // System.out.println(b2);
        // System.out.println(b3);
        // System.out.println(b4);
        // System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        // System.out.println(" byte        : " + a);
        // System.out.println(" int         : " + num);
        // System.out.println(" short       : " + s);
        // System.out.println(" long        : " + l);
        // System.out.println(" float       : " + f);
        // System.out.println(" char        : " + c);
        // System.out.println(" double      : " + d);
        // System.out.println(" boolean     : " + b);

        // Integer Datatypes
        // byte byte_value = 10; // 1byte and range --> -128 to 127
        // short short_value = 120; // 2byte and range --> 
        // int int_value = 2000000000;
        // long long_value = 9000000000000L;

        // // Float
        // float float_value = 3.14f;
        // double double_value = 3.14324565d;

        // char char_value = 'A';
        // boolean boolean_value = true;

        // String string_value = "Algorithms";

        // System.out .println("Byte value         : " + byte_value);
        // System.out .println("Short value        : " + short_value);
        // System.out .println("Int value          : " + int_value);
        // System.out .println("Long value         : " + long_value);
        // System.out .println("Float value        : " + float_value);
        // System.out .println("Double value       : " + double_value);
        // System.out .println("Char value         : " + char_value);
        // System.out .println("Boolean value      : " + boolean_value);
        // System.out .println("String value       : " + string_value);

        // String name1 = "Anil";
        // String name2 = "Kumar";
        // System.out .println(name1 + " " + name2);

        // // Demonstration for typecasting
        // // 1. Widening put smaller data into larger container 
        // // class widening demo 
        // int num = 100;
        // byte result = (byte)num ;
        // System.out .println(result);


        // Range checking functions and codes, methods keywords
        // int a = 10;
        // System.out .println("Range : " + Integer.MAX_VALUE);
        // System.out .println("Range : " + Integer.MIN_VALUE);
        // System.out .println("Range : " + Integer.SIZE);

        byte value = 127;
        System.out .println(value);
        value++;
        System.out .println(value);  // Integer overflow 

        int x = -5;
        System.out .println("Binary : " + Integer.toBinaryString(x));
        int x1 = 5;
        System.out .println("Binary : " + Integer.toBinaryString(x1));



    }
}
