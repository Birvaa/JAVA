import java.util.*;
public class Arrayavg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int sum=0,avg;
		for(int i=0;i<4;i++){
			arr[i]= sc.nextInt();
			sum=sum+arr[i];
		}
		
		
		avg=sum/4;
		System.out.println("avg is :"+avg);

	}
}