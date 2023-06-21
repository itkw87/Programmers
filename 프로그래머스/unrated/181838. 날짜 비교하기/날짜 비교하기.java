class Solution {
    public int solution(int[] date1, int[] date2) {
        return Integer.parseInt(date1[0] + "" + date1[1] + "" + date1[2]) >= Integer.parseInt(date2[0] + "" + date2[1] + "" + date2[2]) ? 0 : 1; 
    }
}