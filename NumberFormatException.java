import java.util.Scanner;

public class NumberFormatException {
    
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
        
        
        
        handleException(input);
        scanner.close();
    }
}