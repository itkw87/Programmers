import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < queries.length; i++) {
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(j % queries[i][2] == 0) {
                    arr[j] += 1;
                }
            } 
        }
        System.out.println(Arrays.toString(arr));
        
        return arr;
    }
}