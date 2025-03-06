 import java.util.Scanner;
 
 class ReturnString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word :");
		String s1 =sc.next();
		
		 char [] charArray = returnCharArray(s1);
		
		char [] array2 = s1.toCharArray();
		
		boolean result = compareTwoArrays(charArray, array2);
		for(int i=0;i<s1.length();i++){
			System.out.print(charArray[i]+" ");
			
		}
		
		System.out.println("\nAre both arrays same ?"+result);
		
	}
	public static char[] returnCharArray(String s1){
		char[] charArray = new char[s1.length()];
		for(int i=0;i<s1.length();i++){
			charArray[i]=s1.charAt(i);
			
		}
		return charArray;
	}
	public static boolean compareTwoArrays(char [] charArray,char [] array2 ){
		if(charArray.length!= array2.length){
			return false;
		}
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]!=array2[i]){
				return false;
			}
		}
		return true;
		
	}
}