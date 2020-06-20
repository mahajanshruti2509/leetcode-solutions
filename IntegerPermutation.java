/*
Given a collection of distinct integers, return all possible permutations.
Example:
Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return new ArrayList<>();
        }
        // stores final result
        List<List<Integer>> result = new ArrayList<>();
        
        // stores numbers which have not been counted towards the answer at any point
        ArrayDeque<Integer> remaining = new ArrayDeque<>();
        
        // stores the numbers bottoms up in the order in which they will appear in the result
        // Imagine this is the prefix of the permutation at any given point
        ArrayDeque<Integer> currStack = new ArrayDeque<>();
        
        for (int n : nums) {
            // in the beginning all numbers are remaining
            remaining.offer(n);
        }
        
        permute(result, remaining, currStack);
        
        return result;
    }
    
    private void permute(List<List<Integer>> result, ArrayDeque<Integer> remaining, ArrayDeque<Integer> currentStack) {
        
        if (remaining.isEmpty()) {
            result.add(new ArrayList<>(currentStack));
        } else {
            for (int i = 0; i < remaining.size(); i++) {
            currentStack.add(remaining.pollFirst());
            permute(result, remaining, currentStack);
            remaining.offerLast(currentStack.pollLast());
            }
        }
    }
}
