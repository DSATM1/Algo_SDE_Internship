public class PassByValue 
{
    // Pass By Reference 
    // public static String get_name1(get_name name)
    // {
    //     name.name = name.name + "S P";
    //     return name.name;
    // }

    // Pass By Value ---->>>>>>>>>
    public static int productNumber(int number)
    {
        return number * 2;
    }
    public static void main(String[] args)
    {   
        // String name = " ";
    //     get_name obj = new get_name();
    //     obj.name = "Suraj";
    //     get_name1(obj);
    //     System.out.println(obj.name);

    int number = 100;
    int n2 = productNumber(number);  
    System.out.println(n2);

    }
}
