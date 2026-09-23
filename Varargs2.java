public class Varargs2 
{
    static void studentReport(String name, int ... number)
    {
        int total = 0 ;
        for(int mark : number)
        {
            total+=mark;
        }
        System.out.println("Student name : " + name);
        System.out.println("Total marks : " + total);
    }

    public static void main(String [] suraj)
    {
        studentReport("Suraj", 10);
        studentReport("Swaroop", 10,20);
        studentReport("DBoss", 10,20,30);
    }
}
