package W_4_31;
import java.util.Scanner;

class ComplexNumber {

    int real, imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
            this.real + other.real,
            this.imaginary + other.imaginary
        );
    }

    ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(
            this.real - other.real,
            this.imaginary - other.imaginary
        );
    }

    ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(
            this.real * other.real - this.imaginary * other.imaginary,
            this.real * other.imaginary + this.imaginary * other.real
        );
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();

        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();

        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();

        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();

        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);

        ComplexNumber sum = c1.add(c2);
        ComplexNumber difference = c1.subtract(c2);
        ComplexNumber product = c1.multiply(c2);

        System.out.print("Addition = ");
        sum.display();

        System.out.print("Subtraction = ");
        difference.display();

        System.out.print("Multiplication = ");
        product.display();

        sc.close();
    }
}