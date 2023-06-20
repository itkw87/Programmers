class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[(intervals[0][1] - intervals[0][0]) + (intervals[1][1] - intervals[1][0]) + 2];
        
        int j = 0;
        for(int g = 0; g < intervals.length; g++) {
            for(int i = intervals[g][0]; i <= intervals[g][1]; i++) {
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}