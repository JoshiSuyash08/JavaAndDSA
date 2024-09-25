package searchingAlgorithms.conditionalLoops;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {

        // Formula: area = (base * height) / 2

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        float base = in.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        float height = in.nextFloat();

        float area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
    }
}
