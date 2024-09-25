package firstJavaCodes;

import java.util.Scanner;

public class PalindromeWithWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check if its palindrome or not: ");
        String string = in.nextLine();

        int start = 0;
        int end = string.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (string.charAt(start) != string.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}