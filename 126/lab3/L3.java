import java.util.Scanner;
public class L3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum=0;
		
		for (i=0;i<6;i++){
			System.out.println("enter marks :");
			int ai =sc.nextInt();
			sum=(sum+ai);
		}
		double pr;
		pr = sum/5.0;
		if(pr>=60){
			System.out.println("1st class");
		}
		if(pr>50 && pr<59){
			System.out.println("2nd class");
		}
		if(pr>40 && pr<49){
			System.out.println("3rd class");
		}
		if(pr<40){
			System.out.println("fail");
		}

	}
}