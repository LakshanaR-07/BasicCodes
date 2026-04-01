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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head,p=head;
        int i=0;
        if(head==null) return head;
        
         int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        curr=head;
        k=k%length;
        while(i!=k){
            while(curr!=null && curr.next!=null){
                p=curr;
                curr=curr.next;
            }
            curr.next=head;
            head=curr;
            p.next=null;
            i++;
        }
        return head;
    }
}