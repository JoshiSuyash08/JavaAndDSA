package firstJavaCodes;


import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();


            int num1 = 0;
            int num2 = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(num1 + " ");
                int temp = num1 + num2;
                num1 = num2;
                num2 = temp;
            }


        }
    }

