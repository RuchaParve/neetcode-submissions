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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        ListNode grpPrev = dummy;

        while(true){
            ListNode kth = getKthNode(grpPrev,k);

            if(kth==null){
                break;
            }

            ListNode cur = grpPrev.next;
            ListNode grpnext = kth.next;
            ListNode prev = kth.next;

            while(cur!=grpnext){
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }

            ListNode temp = grpPrev.next;
            grpPrev.next = kth;
            grpPrev=temp;
        }
        return dummy.next;

    }

    private ListNode getKthNode(ListNode cur,int k){
        while(cur!=null && k>0){
            cur=cur.next;
            k--;
        }
        return cur;
    }
}
