import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] tempArr = new int[rank.length];
        int[] rankArr = new int[3];
        for(int i = 0; i < attendance.length; i++) {  
            if(attendance[i] == true) {
                tempArr[i] = rank[i];
            }
        }
        Arrays.sort(tempArr);  
        int g = 0;
        loop : for(int i = 0; i < tempArr.length; i++) {
            for(int j = 0; j < rank.length; j++) {
                if(tempArr[i] == rank[j]) {
                    rankArr[g] = j;
                    g++;
                    if(g == 3) {
                        break loop; 
                    }
                }
            }
        }
        return 10000 * rankArr[0] + 100 * rankArr[1] + rankArr[2];
    }
}