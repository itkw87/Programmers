class Solution {
    public int solution(int[] sides) {
        int maxInSides = Math.max(sides[0], sides[1]);
        int minInSides = Math.min(sides[0], sides[1]);
        int answer = 0;
        for (int i = maxInSides; maxInSides < i + minInSides; i--) {
           answer++;
        }
        for (int i = maxInSides + 1; i < maxInSides + minInSides; i++) {
            answer++;
        }    
        return answer;
    }
}