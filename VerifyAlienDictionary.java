/*
In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.

Example 1:
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Example 3:

Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 
Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 20
order.length == 26
All characters in words[i] and order are English lowercase letters.
*/

class Solution {
    
    public int[] char_map;
    
    public boolean isAlienSorted(String[] words, String order) {
        char_map = new int[26];
        for(int i = 0; i < order.length(); i++) {
          char_map[order.charAt(i) - 'a'] = i;
        }

        for(int i = 1; i < words.length; i++) {
          if(compare(words[i-1], words[i]) > 0) {
            return false;
          }
        }
        return true;
    }
    
    private int compare(String word1, String word2) {
    int i = 0;
    int j = 0;
    int char_compare_val = 0;

    while(i < word1.length() && j < word2.length() && char_compare_val == 0) {
      // Continue until characters in both words are same
      char_compare_val = char_map[word1.charAt(i) - 'a'] - char_map[word2.charAt(i) - 'a'];
      i++;
      j++;
    }

    /* Characters in both the words are same but we might exit out of the while loop because both strings are not of same     length:
    1) word1 length < word2 length, ex: hel , hello then this returns a negative number which is valid
    2) word2 length > word1 length, ex: hello, hel then this returns a positive number which is not valid
    */
    if(char_compare_val == 0) {
      return word1.length() - word2.length();
    } else {
      return char_compare_val;
    }
  }
}
/*
Time complexity: 0(n)
Space complexity: O(1)
*/
