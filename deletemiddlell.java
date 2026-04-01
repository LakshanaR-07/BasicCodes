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
    public ListNode deleteMiddle(ListNode head) {
         ListNode s=head,f=head;
          ListNode t=new ListNode(0);
          if(head==null || head.next==null){
            return null;
          }
         if(head.next.next==null) {
            head.next=null;
            return head;
         }
        while(f!=null && f.next!=null){
           t=s;
            s=s.next;
            f=f.next.next;
        }
        t.next=s.next;
        return head;   
    }
}