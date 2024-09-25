package searchingAlgorithms.functions;

import java.util.Scanner;

public class productOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers to get their product: ");
        int first = in.nextInt();
        int second = in.nextInt();

        int ans = product(first, second);
        System.out.println("product of two number is :" + ans);

    }
    static int product(int first, int second){
        return first*second;
    }

}
