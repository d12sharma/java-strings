import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings lexicographically
    public static String compareLexicographically(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());

        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return (str1.charAt(i) < str2.charAt(i)) ? str1 + " comes before " + str2
                        : str2 + " comes before " + str1;
            }
        }
        return (str1.length() == str2.length()) ? "Both strings are equal"
                : (str1.length() < str2.length()) ? str1 + " comes before " + str2
                        : str2 + " comes before " + str1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println(compareLexicographically(str1, str2));
    }
}