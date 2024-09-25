package searchingAlgorithms.BinarySearch.LeetCode;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class mountainArr {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // You are in dec part of an array
                //this may be the ans, but look at the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of an array
                start = mid + 1; // because we know that (mid+1) > mid
            }
        }
        // in the end start == end and pointing to the largest number because of the two checks above
        // start and end are always trying to find maximum element in above two checks
        // hence when they are pointing to same element that is the maximum one
        return start; // or end as both are =

    }
}
