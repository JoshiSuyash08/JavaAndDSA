package searchingAlgorithms.conditionalLoops;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class LargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the first number");
        int first = in.nextInt();
        System.out.println("Enter the second number");
        int second = in.nextInt();
        System.out.println("Enter the third number");
        int third = in.nextInt();

        max(first, second, third);
        min(first, second, third);

        System.out.println("The maximum number is::" + max(first, second, third));
        System.out.println("The minimum number is::" + min(first, second, third));

    }
    static int max(int first, int second, int third) {
        //return Math.max(Math.max(first, second), third);

        int max = first;

        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
    static int min(int first, int second, int third) {
        //return Math.min(Math.min(first, second), third);

        int min = first;

        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }

}
