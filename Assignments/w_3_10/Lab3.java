package w_3_10;

import java.util.Scanner;

public class Lab3 {

    public static class Circle {
        int centerX;
        int centerY;
        double radius;

        public Circle(int centerX, int centerY, double radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public void displayDetails() {
            System.out.println("Circle Center: (" + this.centerX + ", " + this.centerY + ")");
            System.out.println("Circle Radius: " + this.radius);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter center X coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter center Y coordinate: ");
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        Circle myCircle = new Circle(x, y, radius);
        myCircle.displayDetails();

        sc.close();
    }
}