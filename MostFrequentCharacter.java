import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256]; // Array to store character frequencies
        char maxChar = ' ';
        int maxFreq = 0;

        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                maxChar = ch;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Most Frequent Character: '" + findMostFrequentChar(input) + "'");
    }
}