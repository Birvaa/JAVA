import java.util.*;
public class ArrayRev{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a size of Array :");
			int n=sc.nextInt();
			int[] arr=new int[n];
			System.out.println("Enter an element into Array : ");
			for(int i=0;i<n;i++){
			int element=sc.nextInt();
			arr[i] = element;
			}	
		for( int i=n-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}