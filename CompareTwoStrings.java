import java.util.Scanner ;

class CompareTwoStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
	    String s1 = sc.next();
		System.out.println("Enter String 2 : ");
	    String s2 = sc.next();
		boolean result = compareStrings(s1,s2);
		 boolean equalsTo = s1.equals(s2);
		boolean checkBoth = (equalsTo == result);
		System.out.println("are both string same? "+result); 
		System.out.println("are both result same? "+checkBoth);
		
		
	}
	// method to compare two strings
	public static boolean compareStrings(String s1 , String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)!=s2.charAt(i)){
			return false;
		}
		
		}
		return true;
		
	}
}
/*
input of s1 = abcd
input of s2 = abdd

output

are both string same? false
are both result same? true
*/