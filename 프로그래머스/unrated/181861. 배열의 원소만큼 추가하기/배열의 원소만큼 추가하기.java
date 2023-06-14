import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int totalSum = 0;
        for(int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
   
        answer = new int[totalSum];
        int startG = 0;
        
        for(int j = 0; j < arr.length; j++) {
            for(int g = startG; g < arr[j] + startG; g++) {
                answer[g] = arr[j];
            }
            startG += arr[j];
        }

        return answer;
    }
}