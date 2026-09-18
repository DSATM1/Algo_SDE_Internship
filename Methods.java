public class Methods 
{
    // write a method which takes integer array as input and return back thr even number of array as output 
    
    // public static void makeItHalf(int number)
    // {
    //     // System.out.println();
    //     number = number / 2; 
    // }

    // public static int makeItHalf_v2(int number2)
    // {
    //     // System.out.println();
    //     number2 = number2 / 2;
    //     return number2; 
    // }

    // public static int get_Number()
    // {

    // }

    public static void makeItHalf(Data objData)
    {
        objData.number = objData.number/2;
    }


    public static void main(String[] args)
    {

        // int num = 10;
        // Methods obj = new Methods();
        // // obj.get_Number();

        // int number = 10;
        // makeItHalf(number);
        // System.out.println(number);

        // int number2 = 20;
        // makeItHalf_v2(number2);
        // System.out.println(number2);

        //int number;
        Data objData = new Data();
        objData.number = 100;
        makeItHalf(objData);
        System.out.println(objData.number);
        
    }    
}
