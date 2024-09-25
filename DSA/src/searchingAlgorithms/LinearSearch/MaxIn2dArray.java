package searchingAlgorithms.LinearSearch;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,43, -88, 55},
                {54, -1, -88, -87},
                {133, -112},

        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE; //or = arr[0][0];
        for (int[] ints : arr) {
            for (int elements : ints) {
                if (elements > max) {
                    max = elements;
                }
            }
        }
        return max;
    }
}
