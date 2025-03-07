import java.util.Scanner;


class ReverseAString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Word :");
		String s1 =sc.next();
		char [] reversedString = new char[s1.length()];
		
		for(int i=0;i<s1.length();i++){
			reversedString[i]=s1.charAt(s1.length() - i -1);
			
		}
		System.out.println("The Reversed String is ");
		for(int i=0;i<s1.length();i++){
		 System.out.print(reversedString[i]);
		}
		 
	}
}