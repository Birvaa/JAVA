public class ComplexDemo{ 
 public static void main(String[] args) {
        Complex c1 = new Complex(8, 4);
        Complex c2 = new Complex(3, 4);
        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
    }
}