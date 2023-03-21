class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0 ;
        int len = 0 ;
        for( int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] == 0){
                len++ ;
                count += len ;
            }else{
                len = 0 ;
            }
        }
        return count ;
    }
}