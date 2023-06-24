class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i <= j; i++) {
            for(int g = 0; g < (i + "").length(); g++) {
                if(((i + "").charAt(g) + "").equals(k + "")) 
                    answer++;
            }
        }
        return answer;
    }
}