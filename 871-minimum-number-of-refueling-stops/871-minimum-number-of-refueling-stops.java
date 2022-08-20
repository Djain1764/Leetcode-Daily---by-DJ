class Solution {
    
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b-a)) ;
        
        int xcurrent = startFuel ;
        int noofStops = 0 ;
        
        for ( int[] station : stations ){
            
            int position = station[0] ;
            int fuel = station[1] ;
            
            while ( xcurrent < position ){
                
                if (pq.isEmpty()) return -1 ;
                xcurrent += pq.poll() ;
                noofStops++ ;
                
            }
            
            pq.offer(fuel) ;
        }
        
        while (xcurrent < target){
            if (pq.isEmpty()) return -1 ;
            xcurrent += pq.poll() ;
            noofStops++ ;
        }
        
        return noofStops ;
        
        
    }
    
    
}