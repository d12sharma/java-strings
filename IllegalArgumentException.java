import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");

        String s1 = sc.next();
        sc.close();

        try {
            generateException(s1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    public static void generateException(String s1) {
        if (s1.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        // This will always throw an exception
        s1.substring(s1.length(), s1.length() - 1);
    }
}
