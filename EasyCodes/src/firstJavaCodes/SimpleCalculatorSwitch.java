package firstJavaCodes;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. using switch
public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = in.nextInt();

        System.out.println("Enter the second number");
        int second = in.nextInt();

        System.out.println("Enter the operator");
        char op = in.next().charAt(0);

        int result;
        switch (op) {
            case '+':
                result = first + second;
                System.out.println("The result is: " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("The result is: " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("The result is: " + result);
                break;
            case '/':
                if (second != 0) {
                    result =  first / second;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("The result is zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }
    }
}
