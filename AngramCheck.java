import java.util.Scanner;

public class AnagramCheck {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
       
        boolean result = isAnagram(str1, str2);
        

        if (result) {
            System.out.println("The given strings are Anagrams.");
        } else {
            System.out.println("The given strings are NOT Anagrams.");
        }
        
        
    }
    
    
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int[] frequency = new int[256]; 
        
        
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
        }
        
       
        for (int i = 0; i < str2.length(); i++) {
            frequency[str2.charAt(i)]--;
        }
       
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    
   
}
/*input
Enter first string: now

Enter second string: won

output 
The given strings are Anagrams.
*/
