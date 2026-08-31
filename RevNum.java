public class RevNum {
    public static void main(String[] args) 
    {
        int a = 527;

        int b = a % 10;
        int c = a / 10 % 10;
        int d = a / 100;

        int reverse = b * 100 + c * 10 + d;

        System.out.println("527="+reverse);
    }
}
