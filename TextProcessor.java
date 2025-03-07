import java.util.Scanner;

public class TextProcessor {
    // Method to find the length of a string without using length()
    public static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split text into words manually
    public static String[] manualSplit(String text) {
        int count = 1;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        int[] spaceIndexes = new int[count - 1];
        int index = 0, spaceCount = 0;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }

        String[] words = new String[count];
        int start = 0;
        for (int i = 0; i < count - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[count - 1] = text.substring(start);

        return words;
    }

    // Method to create a 2D array with words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        scanner.close();

        // Split text manually
        String[] words = manualSplit(inputText);
        
        // Get words with their lengths
        String[][] wordDetails = wordsWithLengths(words);
        
        // Display result in tabular format
        System.out.println("Word\tLength");
        for (String[] wordDetail : wordDetails) {
            System.out.println(wordDetail[0] + "\t" + Integer.parseInt(wordDetail[1]));
        }
    }
}
