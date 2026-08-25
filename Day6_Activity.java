public class Day6_Activity 
{
    public static void main(String [] args)
    {
        // ASCII Code in Kannada --------->>>>>>>>
        // for (int i=0x0C80; i<= 0x0CFF; i++)
        // {
        //     System.out.println((char)i);
        // }

        // Circum and area of a circle --------->>>>>>
        // byte radius = 10;
        // double pie = 3.142;
        // System.out.println("Circumfarence of a Circle : " + 2 * pie * radius);
        // System.out.println("Area of a Circle : " + pie * radius * radius);

        // Area of Rectangle 
        // byte length = 10;
        // byte breadth = 20;
        // System.out.println("Area of Rectangle " + length * breadth);
        
        // Temperature
        // byte Faren = 25  ;
        // float Cel = 12;
        // System.out.println("C to F is " + (Cel * 9/5) + 32 + Faren);
        // System.out.println("F to C is " + (Faren - 32) * 5/9 + Cel);


        byte s1 = 35;
        byte s2 = 78;
        byte s3 = 90;
        byte s4 = 100;
        byte s5 = 50;
        
        int Total = s1 + s2 + s3 + s4 + s5;

        double Avg = (s1 + s2 + s3 + s4 + s5)/5 ;

        float Perc = ((float)Total/500)*100f;

        System.out.println(Total);
        System.out.println(Avg);
        System.out.println(Perc);


    }
}