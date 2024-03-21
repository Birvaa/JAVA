import java.util.Scanner;
public class PrimeNum{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		int count=0,i=2;
		boolean isPrime=true;
		while(i<=n/2){
			if(n%i==0){
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime==true){
			System.out.println("Number is Prime");
		}
		else{
			System.out.println("Number is not Prime");
		}
	}
}