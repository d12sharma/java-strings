import java.util.Scanner;

public class ShortestAndLongest {
	  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        

        String[] words = manualSplit(inputText);
        String[][] wordDetails = wordsWithLengths(words);
        String[] shortestAndLongest = findShortestAndLongest(wordDetails);
        
        System.out.println("Word\tLength");
        for (String[] wordDetail : wordDetails) {
            System.out.println(wordDetail[0] + "\t" + Integer.parseInt(wordDetail[1]));
        }
        
        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);
    }
	
    public static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[] manualSplit(String text) {
        int count = 1;
        for (int i = 0; i < getStringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        int[] spaceIndexes = new int[count - 1];
        int spaceCount = 0;
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

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordsData) {
        String shortest = wordsData[0][0];
        String longest = wordsData[0][0];

        for (String[] wordData : wordsData) {
            if (getStringLength(wordData[0]) < getStringLength(shortest)) {
                shortest = wordData[0];
            }
            if (getStringLength(wordData[0]) > getStringLength(longest)) {
                longest = wordData[0];
            }
        }
        return new String[]{shortest, longest};
    }

  
}
