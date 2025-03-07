import java.util.Scanner;

public class FirstNonRepeatingCharacter {
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        char result = findFirstNonRepeating(input);
        
        
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
       
    }
    
    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256]; // Array to store character frequencies
        
        // Populate frequency array
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        
        return '\0';
    }
    
    
}
