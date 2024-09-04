/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        //Bruteforce
        while (pointerA != null){

            while (pointerB != null){
                if (pointerA == pointerB) return pointerA;
                pointerB = pointerB.next;
            }
            pointerA = pointerA.next;
            pointerB = headB;
        }

        return null;
    }
}