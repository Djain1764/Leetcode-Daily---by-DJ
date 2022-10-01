class Solution {
    public int numDecodings(String s) {
        
        int dp[]=new int[s.length()+1];
        Arrays.fill(dp,-1);
        
        return solverec(s,0,dp);
    }
    
    private   int solverec( String s,int i,int dp[]) {
		
        // base case
		if(i==s.length()) {
			return 1;
		}
        
        // if i value greater than string length so return 0
		if(i>s.length()) return 0;
		
        // if number 0 found so return 0
		if(s.charAt(i)=='0') return 0;
		
        // dp case
        if(dp[i]!=-1){
            return dp[i];
        }
        
        // we take 1 character from string
		int a=solverec(s,i+1,dp);
		
        // if the value (i+1) greater than string length so go to recursion to find another case
		if((i+1)>s.length()) {
			return dp[i]=solverec(s,i,dp);
		}
        
        // if the 2 character value greater than 26 so take only 1 character and rest of the string sent to recursion
		if((i+1)<s.length() && Integer.parseInt(s.substring(i,i+2))>26) {
			return dp[i]=solverec(s,i+1,dp);
		}
		
        // take 2 character from string
		int b=solverec(s,i+2,dp);
        
		return dp[i]=a+b;
		
		
		
	}
    
}