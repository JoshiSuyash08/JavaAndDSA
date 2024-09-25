package firstJavaCodes;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.next();

        str = str.toLowerCase();

        String revstr = "";

        for (int i = str.length()-1; i >=0 ;i--){
             revstr +=  str.charAt(i);
        }
        if (str.equals(revstr)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }


    }
}
