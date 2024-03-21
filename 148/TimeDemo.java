import java.util.Scanner;
class Time{
	int h;
	int m;

	Time(int h,int m){
		this.h=h;
		this.m=m;
	}
	void addTime(Time x ,Time y){
		h=x.h+y.h;
		m=x.m+y.m;
	}
}
public class TimeDemo{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Hours of time : ");
		//t1.h=sc.nextInt();
		//System.out.println("Enter minutes of time : ");
		//t1.m=sc.nextInt();
		//System.out.println("Enter Hours of time : ");
		//t2.h=sc.nextInt();
		//System.out.println("Enter minutes of time : ");
		//t2.m=sc.nextInt();

		Time t1=new Time(3,20);
		Time t2=new Time(5,30);
		Time t3=new Time(0,0);

		t3.addTime(t1,t2);
		System.out.println(t3.h+":"+t3.m);
	}
}