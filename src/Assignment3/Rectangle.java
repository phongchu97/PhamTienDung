package Assignment3;
import java.util.Scanner;

public class Rectangle {
    double rectangleA;
    double rectangleB;

    /**
     * Rectangle
     * */
    public void rectangle(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter rectangle width: ");
        rectangleA = userInput.nextDouble();

        System.out.println("Enter rectangle height: ");
        rectangleB = userInput.nextDouble();
        rectangleArea(rectangleA, rectangleB);
        rectangleCircumference(rectangleA, rectangleB);
    }

    public void rectangleArea(double a, double b){
        System.out.println("Rectangle area: " + (a*b));

    }

    public void rectangleCircumference(double a, double b) {
        System.out.println("Rectangle circumference: " + (a + b + a + b));
    }

    public Rectangle() {
        this.rectangle();
    }

    public static void main(String[] args){
        //Run in main
    }
}
