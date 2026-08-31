public class Dig {
    public static void main(String[] args)
    {

        int a = 786;

        int hundreds = a / 100;
        int tens = (a / 10) % 10;
        int ones = a % 10;

        System.err.println("Original Digits: 786");
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
        System.out.println("Ones: " + ones);
    }
}
