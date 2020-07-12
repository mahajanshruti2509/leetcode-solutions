/*
Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input: s = "leetcode", wordDict = ["leet", "code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple", "pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
             Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false

*/

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        Map<String, Boolean> memoMap = new HashMap<>();
        return dfs(s, wordDictSet, memoMap);
    }
    
    private boolean dfs(String s, Set<String> set, Map<String, Boolean> memoMap) {
        int size = s.length();
        // base case
        if (size == 0) {
          return true;
        }

        if(memoMap.containsKey(s)) {
          return memoMap.get(s);
        }

        //else check for all words
        for (int i = 1; i <= size; i++)
        {
          // Now we will first divide the word into two parts ,
          // the prefix will have a length of i and check if it is
          // present in dictionary ,if yes then we will check for
          // suffix of length size-i recursively. if both prefix and
          // suffix are present the word is found in dictionary.

          if (set.contains(s.substring(0, i)) && dfs(s.substring(i, size), set, memoMap)) {
            memoMap.put(s.substring(i, size), true);
            return true;
          }
        }
        // if all cases failed then return false
        memoMap.put(s, false);
        return false;
  }
}
