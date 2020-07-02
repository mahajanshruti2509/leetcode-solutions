/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.

*/

class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
    
        for(int i = 1; i<=n; i++) {
            dp[i] = i; // worst case, i perfect squares of value 1 will be needed
            for(int j = 1; j*j <=i; j++) {
                int square = j*j;
                dp[i] = Math.min(dp[i], 1 + dp[i - square]);
            }
        }
        return dp[n];
    }
}
