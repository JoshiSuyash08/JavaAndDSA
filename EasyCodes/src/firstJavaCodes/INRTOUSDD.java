package firstJavaCodes;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class INRTOUSDD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the rupees you want to convert to usd");
        double inr = in.nextDouble();

        System.out.println("dollars value of rupees is: " + (inr / 80));
    }
}
