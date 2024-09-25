package searchingAlgorithms.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {-18, 12, 44, -6, -1, 111};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        int min = arr[0];
        // here i = 1 not 0 This ensures that the first element is not compared to itself unnecessarily.
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
