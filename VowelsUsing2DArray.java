import java.util.Scanner;

public class VowelsUsing2DArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        

        String[][] analysis = analyzeCharacters(inputText);
        displayCharacterAnalysis(analysis);
    }
    public static String getCharacterType(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] analyzeCharacters(String text) {
        String[][] result = new String[getStringLength(text)][2];
        for (int i = 0; i < getStringLength(text); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = getCharacterType(text.charAt(i));
        }
        return result;
    }

    public static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void displayCharacterAnalysis(String[][] data) {
        System.out.println("Character\tType");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    
}
