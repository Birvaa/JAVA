import java.util.Scanner;
public class Result{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter Total marks : ");
		int t=sc.nextInt();
		System.out.print("Enter marks of sub 1 : ");
		int m1=sc.nextInt();
		System.out.print("Enter marks of sub 2 : ");
		int m2=sc.nextInt();
		System.out.print("Enter marks of sub 3 : ");
		int m3=sc.nextInt();
		System.out.print("Enter marks of sub 4 : ");
		int m4=sc.nextInt();
		System.out.print("Enter marks of sub 5 : ");
		int m5=sc.nextInt();
		double per=((m1+m2+m3+m4+m5)/(t*5.0))*100;
		if(per>=60){
			System.out.println("First Devision");
		}
		else if(per>=50){
			System.out.println("Second Devision");
		}
		else if(per>=40){
			System.out.println("Third Devision");
		}
		else{
			System.out.println("Fail");
		}
	}
}