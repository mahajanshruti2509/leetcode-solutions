/*

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null || l2 != null) {
            int sum = carry;
            
            if(l1 !=null ) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 !=null ) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            
            if (sum > 9) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }
        
            ListNode nextDigit = new ListNode(sum);
            head.next = nextDigit;
            head = head.next;
        }
        if(carry > 0) {
            ListNode nextDigit = new ListNode(carry);
            head.next = nextDigit;
        }
        return dummy.next;
    }
}
