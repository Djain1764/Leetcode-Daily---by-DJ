class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode head1 = head ;
        // ListNode head2 = head ;
        int n = 1 ;
        while ( head.next != null ){
            head = head.next ;
            n++ ;
        }
        ListNode mid1 = head1 ;
        int x = ( n+1 ) / 2 - 1 ;
        while ( x > 0 ){
            x-- ;
            mid1 = mid1.next ;
        }
        ListNode mid2 = mid1.next ;
        ListNode head2 = Reverse (mid2) ;
        mid1.next = head2 ;
        
        printlist( head1 ) ;
        printlist( head2 ) ;
        
        while ( head2 != null ){
            if ( head1.val != head2.val ) return false ; 
            head1 = head1.next ;
            head2 = head2.next ;
        }
        return true ;
        
        
    }
    
    public ListNode Reverse( ListNode mid ){
        if (mid == null) return null ;
        if (mid.next == null) return mid ;
        // ListNode prev = null ;
        // ListNode curr = mid ;
        // ListNode far = mid.next ;
        // while ( far != null ){
        //     curr.next = prev ;
        //     prev = curr ;
        //     curr = far ;
        //     far = far.next ;
        // }
        // return curr ;
        
        ListNode prev = null;
        ListNode current = mid;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        mid = prev;
        return prev;
    }
    public void printlist (ListNode headk){
        while (headk != null ) {
            if(headk.next != null){
                System.out.print( headk.val +" -> ") ;
            }else{
                System.out.println( headk.val ) ;
            }
            headk = headk.next ;
        }
    }
}