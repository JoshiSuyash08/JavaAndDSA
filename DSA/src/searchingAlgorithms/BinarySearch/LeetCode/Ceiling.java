package searchingAlgorithms.BinarySearch.LeetCode;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { -5, -1, 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        int target = 4;

        int ans = CeilingFinder(arr, target);
        System.out.println(ans);
    }

    static int CeilingFinder(int[] arr, int target) {
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        // find weather the array is asc or desc
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;


            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return arr[start];
    }
}
