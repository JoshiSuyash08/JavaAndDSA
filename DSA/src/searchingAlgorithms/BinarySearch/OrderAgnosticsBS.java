package searchingAlgorithms.BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = { -5, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 9;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
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
        return -1;
    }
}
