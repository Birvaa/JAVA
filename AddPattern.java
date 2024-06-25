import java.util.*;
public class AddPattern{
    public static void main(String []args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int ans = 0;
            for(int j=1; j<=i; j++){
                ans = ans + j;
            }
            sum = sum + ans;
        }
        System.out.println("sum = "+sum);
    }
}