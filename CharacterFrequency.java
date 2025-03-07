import java.util.Scanner;

public class CharacterFrequency {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        int[][] frequencies = findCharacterFrequency(input);
        
        
        System.out.println("Character Frequencies:");
        for (int[] pair : frequencies) {
            System.out.println((char) pair[0] + " : " + pair[1]);
        }
        
        
    }
    
    // Method to find the frequency of characters
    public static int[][] findCharacterFrequency(String str) {
        int[] freq = new int[256]; 
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        
        
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        
        return result;
    }
    
    
}
