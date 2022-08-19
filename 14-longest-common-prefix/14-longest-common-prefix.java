class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }   
        }
        for(int i = 0;i<min;i++){
            char c = strs[0].charAt(i);
            boolean k = true;
            for(int j = 0;j<strs.length;j++){
                if(strs[j].charAt(i)!=c)
                    k = false;
            }
            if(!k)
                break;
            str+=c;
        }
        return str;
    }
}