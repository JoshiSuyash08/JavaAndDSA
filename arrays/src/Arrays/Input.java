package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 33;
        arr[3] = 65;
        arr[4] = 11;
        // [23, 45, 33, 65, 11]
        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}

//        System.out.println(Arrays.toString(arr));
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        //syntax for enhance for loop
//        for(int num : arr) {
        //for every element in the array print the element
//            System.out.print(num + " ");
        //Here num represents element of the array
//        }


