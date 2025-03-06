

import java.util.Scanner;

public class LowerCase {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        scanner.close();

        // Convert text using built-in method
        String builtInLower = inputText.toLowerCase();
        
        // Convert text using custom method
        String manualLower = convertToLower(inputText);
        
        // Compare both results
        boolean isSame = compareStrings(builtInLower, manualLower);
        
        // Display results
        System.out.println("LowerCase : " + builtInLower);
        System.out.println("Do both conversions match? " + isSame);
    }
    // Method to convert text to lowercase
    public static String convertToLower(String text) {
        StringBuilder lowerText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerText.append((char) (ch + 32)); 
            } else {
                lowerText.append(ch);
            }
        }
        return lowerText.toString();
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