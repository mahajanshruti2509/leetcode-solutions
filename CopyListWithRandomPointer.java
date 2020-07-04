/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        Node clonedHead = new Node(head.val);
        Node originalNode = head;
        Node clonedNode = clonedHead;
        map.put(head, clonedHead);
        
        // First pass: Create a mapping of originalNode, clonedNode
        originalNode = originalNode.next; // clonedHead is already mapped with originalHead. Start from next node
        while (originalNode != null) {
            Node temp = new Node(originalNode.val);
            map.put(originalNode, temp);
            clonedNode.next = temp;
            clonedNode = temp;
            originalNode = originalNode.next;
        }
        
        /*Second pass: Move both the pointers to their respective head.
        clonedNode's random will point to originalNode's random*/
        originalNode = head;
        clonedNode = clonedHead;
        while (originalNode != null) {
            if (originalNode.random != null) {
                 clonedNode.random = map.get(originalNode.random);
            }
            else {
                clonedNode.random = null;
            }
            originalNode = originalNode.next;
            clonedNode = clonedNode.next;
        }
        return clonedHead;
    }
}

/*
Time complexity: O(n)
Space complexity: O(n)
*/
