class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        for ( int i = 0 ; i < mat.length ; i++ ){
            countsort (mat, i, 0) ;
        }
        for ( int j = 0 ; j < mat[0].length ; j++ ){
            countsort (mat, 0, j) ;
        }
        
        return mat ;
        
        
        
    }
    
    public void countsort (int[][] mat, int i, int j){
        int m = mat.length ; 
        int n = mat[0].length ; 
        int x = i ;
        int y = j ;
        int[] arr = new int[101] ;
        
        while ( i < m && j < n ){
            arr[mat[i][j]]++ ;
            i++ ;
            j++ ;
        }
        i = x ;
        j = y ;
        for ( int k = 0 ; k < arr.length ; k++ ){
            while (arr[k] > 0){
                mat[i][j] = k ;
                arr[k]-- ;
                i++ ;
                j++ ;
            }
        }
        
    }
}