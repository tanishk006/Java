// find the perimeter and area

import java.util.Scanner;


public class W01_P2{
    public static void main(String[] strings){
        double width;
        double height;
        double perimeter;
        double area;

        Scanner in = new Scanner(System.in);
        width = in.nextDouble();
        height = in.nextDouble();

        perimeter = 2 * (height + width);

        area = width * height;

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n",height, width, perimeter);
        System.out.printf("Area is %.1f * %.1f = %.2f", width, height, area);


        in.close();
    }
}