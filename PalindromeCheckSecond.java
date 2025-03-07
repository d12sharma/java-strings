import java.util.Scanner;

class PalindromeCheckSecond{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :");
		String s1 = sc.next();
		
		String reversed = new StringBuilder(s1).reverse().toString();
		boolean check =s1.equals(reversed);
		System.out.println("is the word palindrome ? "+check);
	}
}