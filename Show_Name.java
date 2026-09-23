public class Show_Name 
{
    static void teamNames(String ... name)
    {
        for(String s : name)
        {
            System.out.println(s);
        }
    }
    public static void main(String [] suraj)
    {
        String name[] = {"Suraj","Swaroop","Shivu","Roshan","Mounish"};
        teamNames(name);
    }
}
