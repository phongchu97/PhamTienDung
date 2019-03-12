package Assignment3;
import java.util.Scanner;

public class Triangle {
    double triangleA;
    double triangleB;
    double triangleC;

    /**
     * Triangle
     * */
    public void triangle(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter triangle width: ");
        triangleA = userInput.nextDouble();

        System.out.println("Enter triangle height: ");
        triangleB = userInput.nextDouble();

        System.out.println("Enter triangle length: ");
        triangleC= userInput.nextDouble();

        this.triangleSize();
    }

    public void triangleArea(double a, double b, double c){
        //Heron
        double p = (a +b +c)/2;
        double S = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println("Triangle area: " + S);
    }

    public void triangleCircumference(double a, double b, double c) {
        System.out.println("Triangle circumference: " + (a + b + c));
    }

    public void triangleSize(){
        if(triangleA == triangleB && triangleB == triangleC) {
            System.out.println("Isosceles Triangle.");
            triangleArea(triangleA, triangleB, triangleC);
            triangleCircumference(triangleA, triangleB, triangleC);
        } else if(triangleA == Math.sqrt(triangleB*triangleB + triangleC*triangleC)
                || triangleB == Math.sqrt(triangleA*triangleA + triangleC*triangleC)
                || triangleC == Math.sqrt(triangleA*triangleA + triangleB*triangleB)) {
            System.out.println("Right-angled triangle.");
            triangleArea(triangleA, triangleB, triangleC);
            triangleCircumference(triangleA, triangleB, triangleC);
        } else {
            System.out.println("Pointed triangle.");
            triangleArea(triangleA, triangleB, triangleC);
            triangleCircumference(triangleA, triangleB, triangleC);
        }
    }

    public Triangle() {
        this.triangle();
    }

    public static void main(String[] args){
        //Run in main
    }

}
