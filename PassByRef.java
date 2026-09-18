public class PassByRef 
{

    // Pass By Reference----->>>>>>
    
    public static void Percentage(Suraj obj)
    {
        obj.num = obj.num + 2;
    }

    public static void main(String[] args)
    {
        Suraj obj = new Suraj();
        obj.num = 78.01f;

        Percentage(obj);
        System.out.println(obj.num);

    }
}
