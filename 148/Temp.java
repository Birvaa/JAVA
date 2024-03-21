import java.util.*;
public class Temp{
	 public static void main(String[] args) {
	 	Scanner sc= new Scanner(System.in);
	 	System.out.printf("Enter the temp in Fahrenheit f :");
	 	double f= sc.nextDouble();
	 	double c=(f-32)*5/9;
	 	System.out.println("Temp in Celsius : "+c);
	 }
}