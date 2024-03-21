import java.util.Scanner;
public class Cals{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter a : ");
		int a=sc.nextInt();
		System.out.print("Enter b : ");
		int b=sc.nextInt();
		System.out.print("Enter operator o : ");
		char o=sc.next().charAt(0);
		double c;
        if(o=='+'){
        	c=a+b;
        	System.out.println("Ans = "+c);
        }
        else if(o=='*'){
        	c=a*b;
        	System.out.println("Ans = "+c);
        }
        else if(o=='/'){
        	c=a/b;
        	System.out.println("Ans = "+c);
        }
        else if(o=='-'){
        	c=a-b;
        	System.out.println("Ans = "+c);
        }
        else if(o=='%'){
        	c=a%b;
        	System.out.println("Ans = "+c);
        }
        else{
        	System.out.println("Invalid operator");
        }
	}
}