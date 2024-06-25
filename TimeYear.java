import java.util.*;
public class TimeYear {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days:");
        int s = sc.nextInt();
        int YY = s / 365;
        int remaining = s - (365*YY);
        int MM = remaining / 30;
        int DD = remaining - (60*MM);
        System.out.println("time is= "+YY+":"+MM+":"+DD);
    }
}