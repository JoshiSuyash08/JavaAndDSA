package searchingAlgorithms.conditionalLoops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check if its even or odd");
        int num = in.nextInt();
        if (isEven(num)){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
        

    }
    static boolean isEven(int num){
        return num % 2 == 0;
    }
}
