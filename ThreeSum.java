/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
Note:
The solution set must not contain duplicate triplets.
Example:
Given array nums = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            if(i > 0 && nums[i] == nums[i - 1]) {
                // ignores duplicates elements at the starting position
                continue;
            }
            
            while(start < end) {
                if(end < nums.length -1 && nums[end] == nums[end+1]) {
                    // ignores duplicates elements at the ending position
                    end --;
                    continue;
                }
                
                if(nums[i] + nums[start] + nums[end] == 0) {
                    List<Integer> triplets = Arrays.asList(nums[i], nums[start], nums[end]);
                    result.add(triplets);
                    start++; 
                    end--;
                } else if(nums[i] + nums[start] + nums[end] < 0) { 
                    start++;
                } else {
                    end --;
                }
            }
        }
        return result;
    }
}
/*
Time complexity: O(n^2)
Space complexity: O(n)
*/
