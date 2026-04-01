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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        int n = 1, i = 0;
        while (curr.next != null) {
            n++;
            curr = curr.next;
        }
        curr = head;
        int[] a = new int[n];
        while (curr != null) {
            a[i] = curr.val;
            i++;
            curr = curr.next;
        }
       
        int left = 0, right = n - 1;

        while (left < right) {
            if (a[left] != a[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}