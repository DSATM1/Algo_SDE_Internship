public class Day_22 
{
    // For Each
    static void traverse(int[] arr)
    {
        for(int x : arr)
        {
            if(x != 4-1)
            System.out.print(x+",");
        }
    }

    // Normal for loop
    // static void show(int [] a)
    // {
    //     for (int i = 0; i < a.length; i++)
    //     {
    //         System.out.println(a[i]);
    //     }
    // }
    public static void main(String [] args)
    {
        // show(new int[] {1,2,3,4});
        //traverse(new int[] {1,2,3,4}); // anonymous array which dosen't have a name  
        int[ ] arr = {1,2,3,4};
        traverse(arr);
    }
}
