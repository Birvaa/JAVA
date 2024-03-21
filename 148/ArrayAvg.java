import java.util.*;
public class ArrayAvg{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[4];
		System.out.println("Enter an element into Array : ");
		for(int i=0;i<4;i++){
			int element=sc.nextInt();
			arr[i] = element;
		}
		int sum=0;
		for(int i=0;i<4;i++){
			sum=sum+arr[i];
		}
		double avg=sum/4 ;
		System.out.println("Avg : "+avg);
	}
}