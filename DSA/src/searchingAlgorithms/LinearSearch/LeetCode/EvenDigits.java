package searchingAlgorithms.LinearSearch.LeetCode;
// Find the numbers with even number of digits.
public class EvenDigits {
    public static void main(String[] args) {
    int[] nums = { 12, 3445, 21, 322, 5445, 123, 9};
   // System.out.println(findNumbers(nums));
   //     System.out.println(digits(-4445));
        System.out.println(digits2(-4445));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    // function to check weather a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);

        // this function is boolean whenever you return a boolean statement it returns true and false
        return numberOfDigits % 2 == 0;
               // or similarly
//        if (numberOfDigits % 2 == 0){
//            return true;
//        }
//        return false;
    }
    // count number of digits in a number

    static int digits(int num) {
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num /= 10; //or num = num / 10;
        }
        return count;
    }
    //optimised version of number of digit
    static int digits2(int num) {
        if(num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}
