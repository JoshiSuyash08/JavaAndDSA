package searchingAlgorithms.conditionalLoops;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class InputSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Enter a number: ");

        //starting infinite loop
        while(true) {
            num = in.nextInt();
            if(num == 0) {
                //breaking that infinite loop
                break;
            }
            sum += num;


        }
        System.out.println("The sum is: " + sum);

    }
}
