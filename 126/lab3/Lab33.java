import java.util.*;
public class Lab33{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter String :");
		 String a=sc.next();
		 int n= a.length(),i=0,end=n-1;
		 while(i<n){
		 	if(a.charAt(i)!=a.charAt(end)){
		 		System.out.println(" not palindrome");
		 		break;
		 	}
		 	else{
		 		i++;
		 		end--;
		 		System.out.println("palindrome");
		 	}	

		 } 
		 
	}
}