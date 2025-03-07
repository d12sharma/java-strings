
import java.util.Scanner;

public class CharacterFrequencySecond {
		
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
       
        String[][] frequencies = findCharacterFrequency(input);
        
        
        System.out.println("Character Frequencies:");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + " : " + pair[1]);
        }
        
        
    }
    
    // Method to find unique characters 
    public static char[] uniqueCharacters(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueChars.append(currentChar);
            }
        }
        
        return uniqueChars.toString().toCharArray();
    }
    
    // Method to find  frequency of unique characters
    public static String[][] findCharacterFrequency(String str) {
        int[] freq = new int[256]; 
        
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
       
        char[] uniqueChars = uniqueCharacters(str);
        
        
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        
        return result;
    }
    
}
