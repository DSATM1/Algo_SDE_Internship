public class Add_Digit {
    public static void main(String[] args) 
    {

        int a = 482;

        int hundreds = a / 100;
        int tens = (a / 10) % 10;
        int ones = a % 10;

        int sum = hundreds + tens + ones;

        System.out.println("Sum: " + sum);
    }
}
