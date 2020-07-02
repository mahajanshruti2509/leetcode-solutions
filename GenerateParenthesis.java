/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    
    private void backtrack(List<String> ans, String curr, int open, int close, int max) {
        // Base case
        if(curr.length() == max * 2) {
            ans.add(curr);
            return;
        }
        
        // Decisions
        if(open < max) {
            backtrack(ans, curr + "(", open + 1, close, max);
        }
        
        if(close < open) {
             backtrack(ans, curr + ")", open, close + 1, max);
        }
    }
}

/*
Time complexity: Exponential
Space complexity: O(n)
*/
