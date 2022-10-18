class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1" ;
        }
        String str = countAndSay(n - 1) ;
        int c = 0 ;
        // String output = "" ;
        StringBuilder res = new StringBuilder() ;
        for( int i = 0 ; i < str.length() ; i++ ){
            c++ ;
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)){
                res.append(c).append(str.charAt(i)) ;
                c = 0 ;
            }
        }
        return res.toString() ;
    }
}