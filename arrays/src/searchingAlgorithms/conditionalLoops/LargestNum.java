package searchingAlgorithms.conditionalLoops;


import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int num;
        System.out.println("Enter a number: ");

        while(true) {
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
