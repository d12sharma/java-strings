import java.util.Scanner;

class IndexOutOfBondException{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
	
		String s1 =sc.next();
		
		// GenerateException(s1);
		StringIndexOutOfBoundsException(s1);
		
	}
	
	public static void GenerateException(String s1){
		s1.charAt(s1.length());
	}
	public static void StringIndexOutOfBoundsException(String s1){
	
	try {
		s1.charAt(s1.length());
	}
	catch (Exception e){
		e.getMessage();
	}
	}
}