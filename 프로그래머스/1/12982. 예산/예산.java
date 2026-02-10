import java.util.Arrays;

class Solution { 
    public int solution(int[] d, int budget) {
        // 오름차순 정렬
        Arrays.sort(d);
        
        int cnt = 0;
        int newBudget = budget;
        boolean isFlow = false;
        for (int i = 0; i < d.length; i++) {
            newBudget -= d[i];
            if (newBudget < 0) {
                isFlow = true;
                cnt = i;
                break;
            }
        }    
        return isFlow ? cnt : d.length;
    }
}