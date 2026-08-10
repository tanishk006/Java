// Write a program that creates a class circle with instances variables for the centre
//  and the radius . initlaize and display it vairbales.

package w_3_10;



public class Lab3{
    
    public static class Circle{
       int  center;
        double  radius;
        

        public Circle(int center, double radius)
        {
             this.center = center;
             this.radius = radius;
        }

           public void displayDetails() {
            System.out.println("Circle Center: " + this.center);
            System.out.println("Circle Radius: " + this.radius);
        }
    }

    public static void main(String[] args)
    { 
        Circle myCircle = new Circle(6 , 3);

        myCircle.displayDetails();


    }
}