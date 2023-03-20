class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0 ;
        for(int i = 0 ; i < flowerbed.length ; i++ ){
            boolean prev = false;
            boolean next = false;
            if(i == 0 || flowerbed[i - 1] == 0){
                prev = true ;
            }
            if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0){
                next = true ;
            }
            if(flowerbed[i] == 0 && prev && next){
                count++ ;
                flowerbed[i] = 1 ;
            }
        }
        return n <= count ;
    }
}