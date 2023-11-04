class Solution {
     public int solution(int[][] sizes) {
        int prevCardMax = 0;
        int prevCardMin = 0;
        for (int[] size: sizes) {
            int curMax = Math.max(size[0], size[1]); 
            int curMin = Math.min(size[0], size[1]); 
            
            prevCardMax = Math.max(curMax, prevCardMax); 
            prevCardMin = Math.max(curMin, prevCardMin);
        }
        return prevCardMax * prevCardMin;
    }
}