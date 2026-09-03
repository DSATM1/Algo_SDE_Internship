public class Day_13 {
    public static void main(String [] args)
    {
        System.out.println("Scenario 1 : Both Strings Literals");
        String s1 = "Java";
        String s2 = "Java";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        System.out.println("Scenario 2 : Both using New ");
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println("Scenario 3 : Literals vs New ");
        String s5 = "Java";
        String s6 = new String("Java");

        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));

    }
}
