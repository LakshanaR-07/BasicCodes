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
    public ListNode partition(ListNode head, int x) {
         if (head == null) return null;
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        ListNode p = smallDummy; 
        ListNode q = largeDummy; 
        ListNode curr=head;
        while(curr!=null){
            if (curr.val < x){
                p.next=curr;
                p=p.next;
            }
           else{
                q.next=curr;
                q=q.next;
            }
            curr=curr.next;
        }
        q.next=null;
        p.next = largeDummy.next;
        return smallDummy.next;
    }
}