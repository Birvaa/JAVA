import java.util.*;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int s = sc.nextInt();
        int Hour = s / 3600;
        int remaining = s - (3600*Hour);
        int Min = remaining / 60;
        int Sec = remaining - (60*Min);
        System.out.println("time is= "+Hour+":"+Min+":"+Sec);

    }
}