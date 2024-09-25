package searchingAlgorithms.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 1;
        System.out.println(linearsearch(arr, target, 2,8));
    }
    static int linearsearch(int[] arr, int key, int start, int end ){
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if (arr[i] == key){
                return i;
            }

        }
        return -1;
    }
}
