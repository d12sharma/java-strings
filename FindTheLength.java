import java.util.Scanner;

class FindTheLength {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :");
		String s1 = sc.next();
		int count=0;
		
		System.out.println("output using inbuilt method :"+s1.length());
		int result = returnLength(s1,count);
		System.out.println("output using user method :"+result);
		
	}
	public static int returnLength(String s1,int count){
		try {
		
		while(true){
			s1.charAt(count);
			count++;
		}
		}
		catch(StringIndexOutOfBoundsException e){
			return count;
		}
	}
}