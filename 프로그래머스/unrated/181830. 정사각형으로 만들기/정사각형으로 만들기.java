class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = arr;
        int plusArrNum = arr.length - arr[0].length;
        int absPlus = Math.abs(arr.length - arr[0].length);
        answer = plusArrNum > 0 ? new int[arr.length][arr[0].length + absPlus] : new int[arr.length + absPlus][arr[0].length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];    
            }
        }
        return answer;
    }
}