import java.util.*;
public class Lab33{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter String :");
		 String a=sc.next();
		 int n= a.length(),i=0,e=n-1;
		 while(i<n){
		 	if(a.charAt(i)!=a.charAt(e)){
		 		System.out.println(" Not Palindrome");
		 		break;
		 	}
		 	else{
		 		i++;
		 		e--;
		 	}	
		 } 
		 System.out.println("Palindrome");
	}
}