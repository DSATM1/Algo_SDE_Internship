import java.util.Scanner;

public class ArrayLoopDemo {

    // Instance Method 1
    // Traversing using for-each loop
    void forEachExample(String[] arr) {

        System.out.println("\n--- Using For-Each Loop ---");

        for (String value : arr) {

            System.out.println("Before changing: " + value);

            // Trying to change the array value
            value = "Changed";

            System.out.println("After changing: " + value);
        }

        System.out.println("\nArray after for-each loop:");

        for (String value : arr) {
            System.out.println(value);
        }
    }


    // Instance Method 2
    // Traversing and changing using normal for loop
    void normalForExample(String[] arr) {

        System.out.println("\n--- Using Normal For Loop ---");

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Before changing: " + arr[i]);

            // Changing the actual array value using index
            arr[i] = "Changed";

            System.out.println("After changing: " + arr[i]);
        }

        System.out.println("\nArray after normal for loop:");

        for (String value : arr) {
            System.out.println(value);
        }
    }


    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        String[] arr = new String[size];

        System.out.println("Enter " + size + " strings:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }


        // Creating object because methods are instance methods
        ArrayLoopDemo obj = new ArrayLoopDemo();


        // Passing the same array to first method
        obj.forEachExample(arr);


        // Passing the same array to second method
        obj.normalForExample(arr);


        sc.close();
    }
}