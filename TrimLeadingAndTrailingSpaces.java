import java.util.Scanner;

public class TrimLeadingAndTrailingSpaces {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        

        int[] indices = getTrimIndices(inputText);
        String trimmedCustom = customSubstring(inputText, indices[0], indices[1]);
        String trimmedBuiltIn = inputText.trim();
        
        System.out.println("user method Trimmed: " + trimmedCustom);
        System.out.println("Built-in method Trimmed: " + trimmedBuiltIn);
        System.out.println("Strings Match: " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
    public static int[] getTrimIndices(String text) {
        int start = 0, end = getStringLength(text) - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (getStringLength(s1) != getStringLength(s2)) {
            return false;
        }
        for (int i = 0; i < getStringLength(s1); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

   
}
