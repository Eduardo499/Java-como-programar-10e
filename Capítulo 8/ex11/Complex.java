public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imagPart = this.imag + other.imag;
        return new Complex(realPart, imagPart);
    }

    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imagPart = this.imag - other.imag;
        return new Complex(realPart, imagPart);
    }

    public void print() {
        System.out.println("(" + this.real + ", " + this.imag + ")");
    }

    public static void main(String[] args) {
        Complex num1 = new Complex(3.0, 4.0);
        Complex num2 = new Complex(1.0, 2.0);

        Complex sum = num1.add(num2);
        System.out.print("Soma: ");
        sum.print();

        Complex difference = num1.subtract(num2);
        System.out.print("Subtração: ");
        difference.print();
    }
}