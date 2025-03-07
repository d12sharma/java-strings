import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call method and display result
        System.out.println("String without duplicates: " + removeDuplicates(input));
    }
}