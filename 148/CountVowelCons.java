import java.util.*;
public class CountVowelCons{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String a=sc.nextLine();
		int vCount=0,cCount=0,spaceCount=0;
		a=a.toLowerCase();

		for( int i=0;i<a.length();i++){
			if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
				vCount++;
			}
			else if(a.charAt(i) == ' '){
				spaceCount++;
			}
			else{
				cCount++;
			}
		}
		System.out.println("Count of Vowel : "+vCount);
		System.out.println("Count of Consonant : "+cCount);
		System.out.println("Count of Space : "+spaceCount);
	}
}