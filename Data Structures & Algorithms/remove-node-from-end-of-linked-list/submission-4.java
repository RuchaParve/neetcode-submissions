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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode t = head;
        while(t!=null){
            length++;
            t=t.next;
        }
        int s =  length-n;

        while(s==0){
            return head.next;
        }
        
        t= head;
        for (int i = 0; i < length - 1; i++) {
            if ((i + 1) == s) {
                t.next = t.next.next;
                break;
            }
            t = t.next;
        }
        return head;
    }
}
