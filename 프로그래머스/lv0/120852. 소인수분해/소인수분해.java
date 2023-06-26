import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        String str = "";
        int cnt = 0;
        boolean flag = true;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                loop :for(int j = 1; j <= i; j++) {
                    flag = true;
                    if(i % j == 0) {
                        if(j != 1 && j != i) { 
                            flag = false;
                            break loop;    
                        }
                    }
                }
                if(flag) {
                    str += i + " ";
                    cnt++;
                }
            }
        }
        answer = new int[cnt];
        int j = 0;
        String strNum = "";
        for(int i = 0; i < str.length(); i++) {  
            if(!" ".equals(str.charAt(i) + "")) {
                strNum += str.charAt(i) + "";     
            } else {
                answer[j] = Integer.parseInt(strNum);
                strNum = "";
                j++;      
            }
        }
        return answer;
    }
}