/**
 * 20. Valid Parentheses
 *
 *  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 *  An input string is valid if:
 *
 *  Open brackets must be closed by the same type of brackets.
 *  Open brackets must be closed in the correct order.
 *  Note that an empty string is also considered valid.
 *
 *  Example 1:
 *  Input: "()"
 *  Output: true
 *
 *  Example 2:
 *  Input: "()[]{}"
 *  Output: true
 *
 *  Example 3:
 *  Input: "(]"
 *  Output: false
 *
 *  Example 4:
 *  Input: "([)]"
 *  Output: false
 *
 *  Example 5:
 *  Input: "{[]}"
 *  Output: true
 *
 * */

class Solution {
  public boolean isValid(String s) {
    if(s==null || s.length()==0) {
      return true;
    }
    if(s.length() % 2 !=0) {
      return false;
    }
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    map.put('(', ')');
    map.put('{', '}');
    map.put('[', ']');

    Stack<Character> stack = new Stack<Character>();
    for (int i=0; i< s.length(); i++) {
      char curr = s.charAt(i);
      if(map.keySet().contains(curr)) {
        stack.push(curr);
      } else if(map.values().contains(curr)) {
        if(!stack.empty() && map.get(stack.peek()) == curr) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.empty();
  }
}