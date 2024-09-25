package Arrays.Question;

public class max {
    public static void main(String[] args) {
        int[] arr = {1,2,60,4,599};
        System.out.println(maxRange(arr, 2, 4));
//        System.out.println(max(arr));
    }

    // work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if(end >  start){ // edge case
            return -1;
        }
        if(arr == null){ // egde case
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Imagine that array is not empty

//    static int max(int[] arr) {
//     if (arr.length == 0){ // edge case
//        return -1;
//    }
//        int maxVal = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i]>maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }
}
