import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {   
        String str1 = "";
        String str2 = "";
        boolean flag = false;
        int cnt = 0;
        while(!flag) {
            str1 = Arrays.toString(arr);
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;    
                } else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            str2 = Arrays.toString(arr);
            if(str1.equals(str2)) {
                flag = true;
                break;
            }
            cnt ++;
        }
        return cnt;
    }
}