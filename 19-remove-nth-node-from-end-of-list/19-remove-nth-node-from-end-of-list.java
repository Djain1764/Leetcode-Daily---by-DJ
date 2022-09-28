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
        ListNode start = new ListNode() ;
        start.next = head ;
        ListNode d1 = start ;
        ListNode d2 = start ;
        
        while(n >= 1){
            d2 = d2.next ;
            n-- ;
        }
        while(d2.next != null){
            d1 = d1.next ;
            d2 = d2.next ;
        }
        // if(d1 == head){
        //     d1 = d1.next ;
        //     return d1 ;
        // }
        d1.next = d1.next.next ;
        return start.next ;
    }
}