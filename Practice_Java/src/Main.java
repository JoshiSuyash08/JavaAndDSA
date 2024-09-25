import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to determine if its even or odd");
        boolean n = in.nextBoolean();

    }

    static boolean EvenOdd(boolean n) {
        if (n % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
    }
}