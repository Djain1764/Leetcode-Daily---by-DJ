class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1" ;
        }
        if (n == 2){
            return "11" ;
        }
        String str = countAndSay(n - 1) ;
        int c = 1 ;
        String output = "" ;
        for( int i = 1 ; i < str.length() ; i++ ){
            if(i == str.length() - 1){
                if(str.charAt(i) != str.charAt(i - 1)){
                    output = output + c + str.charAt(i - 1) ;
                    c = 1 ;
                    output = output + c + str.charAt(i) ;
                }else{
                    c++ ;
                    output = output + c + str.charAt(i) ;
                }    
            }else if(str.charAt(i) != str.charAt(i - 1)){
                output = output + c + str.charAt(i - 1) ;
                c = 1 ;
            }else
                c++ ;
        }
        return output ;
    }
}