package firstJavaCodes;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers to get largest number");

        int n1 = in.nextInt();
        int n2 = in.nextInt();

//        if (n1 > n2) {
//            System.out.println("Largest number is: " + n1);
//        } else if (n2 > n1) {
//            System.out.println("Largest number is: " + n2);
//        } else {
//            System.out.println("Both numbers are equal");
//        }

        //simpler way to do this
        int largest = (n1 > n2) ? n1 : n2;
        System.out.println("Largest number is: " + largest);
    }
}
