import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        String str = "";
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            cnt = 0;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    cnt ++;
                }
            }
            if(cnt == 0) 
                 str += arr[i] + " ";
        }

        String[] strArr = str.trim().split(" ");   
        answer = new int[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }

        return answer;
    }
}