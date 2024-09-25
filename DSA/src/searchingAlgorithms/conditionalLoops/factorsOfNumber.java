package searchingAlgorithms.conditionalLoops;
//input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class factorsOfNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
