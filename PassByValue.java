public class PassByValue 
{
    // Pass By ref 
    public static String get_name1(get_name name)
    {
        name.name = name.name + "S P";
        return name.name;
    }
    public static void main(String[] args)
    {   
        // String name = " ";
        get_name obj = new get_name();
        obj.name = "Suraj";
        get_name1(obj);
        System.out.println(obj.name);
    }
}
