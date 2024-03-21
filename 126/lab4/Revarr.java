import java.util.*;
public class Revarr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int i;
		for(i=0;i<4;i++){
			arr[i]= sc.nextInt();			
		}
		for(i=3;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}