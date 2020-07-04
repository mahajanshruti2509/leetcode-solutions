/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
A mapping of digit to letthttps://github.com/mahajanshruti2509/leetcode-solutionsers (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
*/

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits.length() == 0) {
            return result;
        }
    
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        
        for(int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i) {
                String permutation = result.remove();
                for(char c : mapping[index].toCharArray()) {
                    result.add(helper(permutation, c));
                }
            }
        }
        return result;
    }
    
    private String helper(String str, char charToAppend) {
        StringBuilder sb = new StringBuilder(str);
        return sb.append(charToAppend).toString();
    }
}

/*
Time complexity: O(3 ^ N * 4 ^ M),
where here N is the number of digits in the input that maps to 3 letters (e.g. 2, 3, 4, 5, 6, 8) 
and M is the number of digits in the input that maps to 4 letters (e.g. 7, 9), and N+M is the total number digits in the input.
Space complexity: O(3 ^ N * 4 ^ M)
*/
