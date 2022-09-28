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
        ListNode tail = head ;
        int len = 1 ;
        while(tail.next != null){
            tail = tail.next ;
            len++ ;
        }
        if (len == n) return head.next ;
        int iter = 1 ;
        tail = head ;
        while(len - n > iter){
            tail = tail.next ;
            iter++ ;
        }
        tail.next = tail.next.next ;
        return head ;
    }
}