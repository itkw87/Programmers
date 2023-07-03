class Solution {
    public int solution(int[][] dots) {
        int[] width = {-255, 255};
        int[] height = {-255, 255};  
        for(int i = 0; i < dots.length - 1; i++) {
           if(width[0] < Math.max(dots[i][0], dots[i + 1][0])) 
               width[0] = Math.max(dots[i][0], dots[i + 1][0]);    
           if(width[1] > Math.min(dots[i][0], dots[i + 1][0])) 
               width[1] = Math.min(dots[i][0], dots[i + 1][0]);   
           if(height[0] < Math.max(dots[i][1], dots[i + 1][1])) 
               height[0] = Math.max(dots[i][1], dots[i + 1][1]);
           if(height[1] > Math.min(dots[i][1], dots[i + 1][1])) 
               height[1] = Math.min(dots[i][1], dots[i + 1][1]);
        }
        return (width[0] - width[1]) * (height[0] - height[1]); 
    }
}