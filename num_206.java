/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head != null){
            ListNode next = head.next;//2-3-4-5-n
            head.next = newHead;//1-n
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
