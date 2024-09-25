package firstJavaCodes;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(a + b);
        } else if (op == '-') {
            System.out.println(a - b);
        } else if (op == '*') {
            System.out.println(a * b);
        } else if (op == '/') {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid Operator");
        }



    }
}
