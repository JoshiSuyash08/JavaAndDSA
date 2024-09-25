package Arrays;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.println("Not a prime number");
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is a prime number");
                    break;
                }

            }


        }

    }
}
