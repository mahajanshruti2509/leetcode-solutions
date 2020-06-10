/*
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currSum = 0;
        Map<Integer,Integer> prefixSum = new HashMap<Integer, Integer>();
        prefixSum.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if(prefixSum.containsKey(currSum-k)){
                count += prefixSum.get(currSum-k);
            }
            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
        } 
        return count;
    }
}
