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
        
        Stack<Integer> st = new Stack<>() ;
        ListNode tail = head ;
        while ( tail != null){
            st.add(tail.val) ;
            tail = tail.next ;
        }
        tail = head ;
        while( !st.isEmpty() ){
            if ( st.pop() != tail.val ) return false ;
            tail = tail.next ;
        }
        return true ;
        
        
    }
}