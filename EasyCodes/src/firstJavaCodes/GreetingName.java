package firstJavaCodes;

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = in.nextLine();

        System.out.println("Greetings " + name);

    }
}
