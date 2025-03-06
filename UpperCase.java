import java.util.Scanner;

public class UpperCase {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        scanner.close();

        // Convert text using built-in method
        String builtInUpper = inputText.toUpperCase();
        
        // Convert text using custom method
        String manualUpper = convertToUpper(inputText);
        
        // Compare both results
        boolean isSame = compareStrings(builtInUpper, manualUpper);
        
        // Display results
        System.out.println("Uppercase : " + builtInUpper);
        System.out.println("Do both conversions match? " + isSame);
    }
    // Method to convert text to uppercase manually
    public static String convertToUpper(String text) {
        StringBuilder upperText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperText.append((char) (ch - 32)); 
            } else {
                upperText.append(ch);
            }
        }
        return upperText.toString();
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    
}