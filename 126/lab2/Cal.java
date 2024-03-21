import java.util.*;
public class Cal{
	 public static void main(String[] args) {
	 	Scanner sc= new Scanner(System.in);
	 	System.out.println("enter Number :");
	 	double x= sc.nextDouble();
	 	System.out.println("enter Number :");
	 	double y= sc.nextDouble();
	 	System.out.println("enter operator :");
	 	char z= sc.next().charAt(0);
	 	double ans = 0;
	 	if(z=='+'){
              ans=x+y;
	 	}
	   else if(z=='-'){
              ans=x-y;
	 	}
	 
	 else if(z=='*'){
              ans=x*y;
	 	}
	  else if(z=='/'){
              ans=x/y;
	 	}
	  else if(z=='%'){
              ans=x%y;
	 	}
	 	System.out.println(ans);
	 }
	}
	 