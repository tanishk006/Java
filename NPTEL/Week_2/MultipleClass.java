package Week_2;
import java.util.Scanner;

public class MultipleClass
{
static class Circle {
    int radius;
    


Circle(int radius){
    this.radius = radius;
}
}
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the radius");

    int r = sc.nextInt();

    Circle c = new Circle(r);

    System.out.print("Radius of the Circke is :" + c.radius);

    sc.close();
}
}