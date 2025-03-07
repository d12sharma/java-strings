import java.util.Scanner;

public class Vowels {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        

        int[] counts = countVowelsAndConsonants(inputText);
        
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
    public static boolean isVowel(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < getStringLength(text); i++) {
            char ch = text.charAt(i);
            if (isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

   
}
