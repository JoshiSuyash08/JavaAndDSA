package searchingAlgorithms.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,23,44,54,76,55,34,67};
        int target = 5;
        int ans = linearsearch3(nums, target);
        System.out.println(ans);
    }

    // search in the index: return the index if item is found
    //otherwise if item is not found return -1
//    static int linearsearch(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int index = 0; index < arr.length; index++){
//            // check for element at every index if it is = target
//            int element = arr[index];
//            if (element == target){
//                return index;
//            }
//        }
//        //this line will execute if none of the return statements above have executed
//        //hence the target not found
//        return -1;


    //Returning the element
//    static int linearsearch2(int[] arr, int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        for (int element : arr) {
//
//            if (element == target) {
//                return element;
//            }
//        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
//        return -1;


//returning the true or false
    static int linearsearch3(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;

    }
}
