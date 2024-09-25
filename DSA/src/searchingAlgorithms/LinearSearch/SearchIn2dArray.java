package searchingAlgorithms.LinearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
         int[][] arr = {
                 {1,43, -88, 55},
                 {54, -1, -88, -87},
                 {133, -112},
         };
         int key = -88;
         int[] ans = search(arr, key);
        System.out.println(Arrays.toString((ans)));
    }
    static int[] search(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j< arr[i].length; j++){
                if (arr[i][j] == key){
                    //here we are creating new object to return array
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{-1,-1};
    }
}
