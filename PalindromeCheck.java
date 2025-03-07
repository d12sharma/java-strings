import java.util.Scanner;

public class PalindromeCheck {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
       
        boolean method1 = isPalindrome(input);
        boolean method2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean method3 = isPalindromeUsingArray(input);
        
     
        System.out.println("Using start-end index comparison: " + (method1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using recursion: " + (method2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using character arrays: " + (method3 ? "Palindrome" : "Not a Palindrome"));
        
        scanner.close();
    }
    
    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
    
   
    public static boolean isPalindromeUsingArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            reversed[i] = str.charAt(str.length() - 1 - i);
        }
        
        for (int i = 0; i < str.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    
   
}
/*
Enter a string: dhrrhd
Using start-end index comparison: Palindrome
Using recursion: Palindrome
Using character arrays: Palindrome

*/