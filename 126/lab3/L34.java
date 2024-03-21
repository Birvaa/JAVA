import java.util.*;
public class L34{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int a= sc.nextInt();
		int count=0,i=1;
		while(i<=a){
			if(a%i!=0){
				count++;
			}
			i++;	
		}
		if(count==2){
			System.out.println("prime");
		}
		else{
			System.out.println(" not prime");
		}
	}
}