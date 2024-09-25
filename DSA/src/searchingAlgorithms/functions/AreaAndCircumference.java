package searchingAlgorithms.functions;

import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle");
        double radius = in.nextDouble();
        double area = Area(radius);
        double circumference = Circumference(radius);
        System.out.println("Area of circle is: " + area + " circumference of circle is: " + circumference);
    }
    static double Area(double radius){
        return 3.14159 * radius * radius;
    }
    static double Circumference(double radius){
        return 2 * 3.14159 * radius;
    }
}
