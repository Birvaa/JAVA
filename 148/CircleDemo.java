import java.util.Scanner;
class Circle{
	double radius;

	public double areaOfCircle(){
		return Math.PI*radius*radius;
	}

}
public class CircleDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter the radius of circle : ");
		c.radius= sc.nextDouble();

        System.out.println("Area : "+c.areaOfCircle());
	}
}