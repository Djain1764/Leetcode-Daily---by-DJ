class Solution {
    public int minCost(String colors, int[] time) {
        int res=0;
        for(int i=1;i<colors.length();i++)
        {
            int s=0,max=0;
            boolean f = false;
            while(i<colors.length() && colors.charAt(i-1) == colors.charAt(i))
            {
                s += time[i-1];
                max = Math.max(max,Math.max(time[i-1],time[i]));
                f = true;
                i++;
            }
            if(f)
                s+=time[i-1];
            res+=s-max;
        }
        return res;
    }
}