import java.util.*;
public class L33{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int a= sc.nextInt();
		System.out.println("enter number");
		int b= sc.nextInt();
		System.out.println("enter number");
		int c= sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println(" max is "+a);
			}
			else{
				System.out.println(" max is "+c);
			}

		}
		else{
			if(b>c){
				System.out.println(" max is "+b);
			}
			else{
				System.out.println(" max is "+c);
			}
			
	}
		}
}
