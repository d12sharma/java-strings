import java.util.Scanner;

public class WordSplit {
    
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

   
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();
        scanner.close();

        
        String[] builtInSplit = inputText.split(" ");
        
        
        String[] manualSplitResult = manualSplit(inputText);
        
        // Compare both results
        boolean isSame = compareArrays(builtInSplit, manualSplitResult);
        
      
        System.out.println("Split (Built-in): " + String.join(", ", builtInSplit));
        System.out.println("Split (Manual): " + String.join(", ", manualSplitResult));
        System.out.println("Do both split methods match? " + isSame);
    }
}
