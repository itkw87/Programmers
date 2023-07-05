class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        answer[0] = arr[0];
        int idx = 1;
        boolean flag = true;
        for(int i = 0; i < arr.length; i++) {
            flag = true;
            for(int j = 0; j < answer.length; j++) {
                if(arr[i] == answer[j]) 
                    flag = false;
            }
            if(flag) {
                if(answer.length > idx) {
                    answer[idx]  = arr[i]; 
                    idx++;
                }
            }
        }
        return answer;
    }
}