import java.util.*;

public class Library 
{
    static void library()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book that u want to find : ");
        String arr[] = {"DBMS","OS","DSA","C","CPP"};
        String user_input=sc.next();
        
        int index = 0;
        boolean found = false;

        while(index <= arr.length-1)
        {
            if(user_input.equalsIgnoreCase(arr[index]))
            {
                found = true;
                break;
            }
            index++;
        }
            if(found)
            {
                System.out.println("Book Found");
            }
            else 
            {
                System.out.println("Book Not Found");
            } 
            sc.close();         
    } 
    public static void main()
    {
        library();
    }    
}
