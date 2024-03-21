import java. util.*;
public class Diamond{
	public static void main(String[] args) {
		int i,j;
         Scanner sc= new Scanner(System.in);
         System.out.print("enter number :");
         int a = sc.nextInt();
         for(i=0;i<=((a*2)-1);i++){
         	if(i>a){
         		for(j=a;j>=i-(a-1);j--){
         			System.out.print("*");
         		}
         	}
         	else{
         		for(j=1;j<=i;j++){
         			System.out.print("*");
         		}
         	}
         	System.out.println();
         }		
	}
}