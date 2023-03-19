class WordDictionary {
    
    WordDictionary[] children;
    boolean isEnd;

    public WordDictionary() {
        children = new WordDictionary[26];
        isEnd = false;
    }
    
    public void addWord(String word) {
        WordDictionary addword = this ;
        for(char c : word.toCharArray() ){
            int index = c - 'a' ;
            if(addword.children[index] == null ){
                addword.children[index] = new WordDictionary() ;
            }
            addword = addword.children[index] ;
        }
        addword.isEnd = true ;
    }
    
    public boolean search(String word) {
        WordDictionary addword = this ;
        for(int i = 0; i < word.length(); ++i){
            char c = word.charAt(i);
            if(c == '.'){
                for( WordDictionary ch : addword.children)
                    if(ch != null && ch.search(word.substring(i+1)))
                        return true ;
                return false ;
            }
            
            int index = c - 'a' ;
            if(addword.children[index] == null )
                return false ;
            addword = addword.children[index] ;
        }
        return addword.isEnd ;
    }
}