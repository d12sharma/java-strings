import java.util.*;

public class VotingEligibility {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        
        
        int[] ages = generateAges(numStudents);
        String[][] eligibility = checkVotingEligibility(ages);
        displayResults(eligibility);
    }
    public static int[] generateAges(int numStudents) {
        Random rand = new Random();
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = rand.nextInt(90) + 10; // Generates ages between 10 and 99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else {
                result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
            }
        }
        return result;
    }

    public static void displayResults(String[][] data) {
        System.out.println("Age\tVoting Eligibility");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

   
}
