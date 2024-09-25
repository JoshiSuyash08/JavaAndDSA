package searchingAlgorithms.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -5, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = -1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            int mid = start + (end - start)/2; // might be possible that  (start + end) exceed the length of integer

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }


}
