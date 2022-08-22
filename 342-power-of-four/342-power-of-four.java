class Solution {
    public boolean isPowerOfFour(int n) {
        // while ( n % 4 == 0 ) n = n / 4 ;
        // if ( n == 1 ) return true ;
        // return false ;
        if ( n == 0 ) return false ;
        double i = Math.log(n) / Math.log(4);
 
        // return true if `log4(n)` is an integer
        return i == Math.floor(i);
    }
}