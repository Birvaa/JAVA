public class Complex {
    double real;
    double imaginary;

    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

  
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

 
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }
    public Complex add(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, 7);
        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
    }
}