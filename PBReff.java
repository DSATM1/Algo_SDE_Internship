public class PBReff 
{
    static void getName(Country changeName)
    {
        changeName.name = "Suraj";
    }

    public static void main(String [] args)
    {
        Country obj = new Country();
        obj.name = "Swaroop"; 
        System.out.println(obj.name);

        getName(obj);
        System.out.println(obj.name);
    }    
}
