import java.util.Scanner ;

class CountVowelsAndConstants{
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a word or sentence :");
			String  s1 = sc.nextLine();
			int vowels=0;
			int constants=0;
		
		for(int i=0;i<s1.length();i++){
			
			if(s1.charAt(i)=='a' || s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
				vowels++;
			}
			else if(s1.charAt(i)==' '){
				continue;
			}
			else{
				constants++;
			}
			
		}
		System.out.println("The count of vowels for the string is :"+vowels);
		System.out.println("The count for constants for the string is :"+constants);
		}	
}
/*  input 
dhruv sharma 

output 
The count of vowels for the string is :3
The count of constants for the string is :8
*/