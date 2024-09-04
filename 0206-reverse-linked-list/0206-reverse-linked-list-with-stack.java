/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null) return head;
        
        Stack<ListNode> stack = new Stack<>();
        ListNode t = head;

        while (t != null){
            stack.push(t);
            t = t.next;
        }
        
        ListNode newHead = stack.pop();
        ListNode curr = newHead;

        while (!stack.empty()){
            curr.next = stack.pop();
            curr = curr.next;
        }
        
        curr.next = null; //To avoid the cycle last node should point to null
        return newHead;
    }
}