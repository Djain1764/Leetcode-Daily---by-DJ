class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>() ;
        for ( int i = 0 ; i < magazine.length() ; i++ ){
            map.put (magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1) ;
        }
        for ( int i = 0 ; i < ransomNote.length() ; i++ ){
            char c = ransomNote.charAt(i) ;
            if ( !map.containsKey(c) ) return false ;
            else {
                int val = map.getOrDefault(c, 0) ;
                if (val == 0) 
                    return false ;
                else{
                    map.put (c, val - 1 ) ;
                }
            }
        }
        
        return true ;
    }
}