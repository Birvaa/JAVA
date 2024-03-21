import java.util.Scanner;
public class MaxNum{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter number a : ");
		int a=sc.nextInt();
		System.out.print("Enter number b : ");
		int b=sc.nextInt();
		System.out.print("Enter number c : ");
		int c=sc.nextInt();
		 if(a>b){
		 	if(a>c){
		 		System.out.println("Maximum Number is "+a);
		 	}
		 	else{
		 		System.out.println("Maximum Number is "+c);
		 	}
		 }
		 else{
		 	if(b>c){
		 		System.out.println("Maximum Number is "+b);
		 	}
		 	else{
		 		System.out.println("Maximum Number is "+c);
		 	}
		 }
	}
}