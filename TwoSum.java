/**
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * */

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] output = new int[2];
    if(nums == null || nums.length == 0) {
      return output;
    }

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int complement = 0;

    for(int i = 0; i < nums.length; i++) {
      complement = target - nums[i];
      if(map.containsKey(complement)) {
        output[0] = map.get(complement);
        output[1] = i;
        return output;
      }
      map.put(nums[i], i);
    }
    return output;
  }
}
