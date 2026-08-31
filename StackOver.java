public class StackOver {
    static void show() {
        System.out.println("Calling show()");
        show(); // Method calls itself again
    }

    public static void main(String[] args) {
        show();
    }
}
