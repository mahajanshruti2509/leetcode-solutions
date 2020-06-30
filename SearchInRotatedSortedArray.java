/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
*/


class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        if(nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        
        int n = nums.length;
        if(nums[0] < nums[n - 1]) {
            return binarySearch(nums, 0, n - 1, target);
        }
        
        int idx = pivotIndex(nums, 0, n - 1);
        if(target >= nums[0] && target <= nums[idx - 1]) {
            return binarySearch(nums, 0, idx - 1, target);
        }
        else if(target >= nums[idx] && target <= nums[n - 1]) {
            return binarySearch(nums, idx, n - 1, target);
        }
        return -1;
    }
 
    int pivotIndex(int[] nums, int s, int e) {
        int m = (s + (e - s) / 2);
        if(nums[m] > nums[m + 1]) {
            return m + 1;
        }
        else if(nums[s] > nums[m]) {
            return pivotIndex(nums, s, m - 1);
        }
        else {
            return pivotIndex(nums, m + 1, e);
        }
    }
    
    int binarySearch(int[] nums, int s, int e, int target) {
        if(s > e) {
            return -1;
        }
        
        int m = (s + (e - s) / 2);
        if(nums[m] == target) {
            return m;
        }
        else if(target < nums[m]) {
            return binarySearch(nums, s, m - 1, target);
        }
        else {
            return binarySearch(nums, m + 1, e, target);
        }
    }
}
