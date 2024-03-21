import java.util.Scanner;
public class Area{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter a radius of circle r : ");
		double r=sc.nextDouble();
		double area=3.14*r*r;
		System.out.println("Area = "+area);
	}
}