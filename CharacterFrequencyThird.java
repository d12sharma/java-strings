import java.util.Scanner;

public class CharacterFrequencyThird {
		 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
       
        String[] frequencies = findCharacterFrequency(input);
        
        
        System.out.println("Character Frequencies:");
        for (String pair : frequencies) {
            System.out.println(pair);
        }
        
    
    }
	
    
    // Method to find the frequency of characters 
    public static String[] findCharacterFrequency(String str) { 
        char[] chars = str.toCharArray();
        int[] freq = new int[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue; 
            freq[i] = 1;
            
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }
        
      
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }
        
        
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }
        
        return result;
    }
    
   
}
