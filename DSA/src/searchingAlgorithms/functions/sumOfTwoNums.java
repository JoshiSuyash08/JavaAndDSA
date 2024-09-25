package searchingAlgorithms.functions;

import java.util.Scanner;

public class sumOfTwoNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first nummber ");
        int a = in.nextInt();
        System.out.println("Enter the second number ");
        int b = in.nextInt();
        int ans = sum(a,b);
        System.out.println(ans);

    }

    static int sum(int a, int b){
        int ans = a + b;
        return ans;
    }
}
