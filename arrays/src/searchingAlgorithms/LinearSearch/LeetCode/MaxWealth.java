package searchingAlgorithms.LinearSearch.LeetCode;
// https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {3,2,1},  {3,2,6}};
        System.out.println(maximumWealth(arr));
    }

    static public int maximumWealth(int[][] accounts) {

        // person = row = i
        // account = col = j
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // When you start a new col, take a new sum for that row
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
