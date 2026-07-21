// Volume of Cylinder

import java.util.Scanner;

public class W01_p3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      double radius = in.nextDouble();
      double height = in.nextDouble();

        // pi*r^2*h


       double volume = Math.Pi * radius * radius * height ;

       System.out.printf("Volume is %.2f",  volume);

        in.close();
    }
}
