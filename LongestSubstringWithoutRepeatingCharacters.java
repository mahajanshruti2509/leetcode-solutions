/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        HashSet<Character> hashSet = new HashSet<>();
        
        while(b_pointer < s.length()) {
            if(!hashSet.contains(s.charAt(b_pointer))) {
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}
