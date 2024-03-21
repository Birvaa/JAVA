import java.util.*;
public class Vowel{
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your String :");
         String a=sc.nextLine();
        int i=0,b=a.length(),n=b,vowel=0,con=0;
        while(i!=n){
        	if(a.charAt(i)== 'a'|| a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ){
                       vowel++;
        } 
        else{
        	con++;
        } 
            i++;                        
       }
       System.out.println(" total vowel is "+vowel);
        System.out.println(" total con. is "+con);               
	}
}