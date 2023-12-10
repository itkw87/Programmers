class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int stackHeight = 0;
        int[] stack = new int[ingredient.length];
        for (int i = 0; i < ingredient.length; i++) {
            if (stackHeight >= 3 && stack[stackHeight - 3] == 1 && stack[stackHeight - 2] == 2 
                && stack[stackHeight - 1] == 3 && ingredient[i] == 1) {
                stackHeight -= 3;
                answer++;
            } else {
                stack[stackHeight++] = ingredient[i];
            }
        }
        return answer;
    }
}
