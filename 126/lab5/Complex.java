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
        this.imaginary = imaginary;
    }
    public Complex add(Complex c2) {
        double realSum = this.real + c2.real;
        double imaginarySum = this.imaginary + c2.imaginary;
        return new Complex(realSum, imaginarySum);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(8, 4);
        Complex c2 = new Complex(3, 4);
        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
    }
}