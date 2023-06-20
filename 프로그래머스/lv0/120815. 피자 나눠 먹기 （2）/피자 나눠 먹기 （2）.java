class Solution {
    public int solution(int n) {      
        int pizzaPice = 6;
        
        while(pizzaPice % n != 0) {
            pizzaPice += 6;
        }        
        
        return pizzaPice / 6;
    }
}