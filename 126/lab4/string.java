import java.util.*;
public class string{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter your String :");
         String a=sc.nextLine();
         int b=a.length();
         int c=b/2,i;
         for(i=c;i<b;i++){
              System.out.println(a.charAt(i));              
         }
     }
 }