package firstJavaCodes;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a principal amount (P)");
        double principle = in.nextDouble();

        System.out.println("Please enter a Time (T)");
        double Time = in.nextDouble();

        System.out.println("Please enter a principal rate (R)");
        double Rate = in.nextDouble();

        double SimpleInterest = (principle * Time * Rate) / 100;
        System.out.println("The Simple Interest is " + SimpleInterest);

    }
}
