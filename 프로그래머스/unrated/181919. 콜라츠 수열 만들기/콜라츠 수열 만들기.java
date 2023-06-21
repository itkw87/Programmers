import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int temp = n;
        int cnt = 1;
        while(true) {
            if(temp % 2 == 0) {
                temp =  temp / 2;
            } else if(temp % 2 == 1) {
                temp = 3 * temp + 1;
            }
             cnt++;
            if(temp == 1) 
                break;
        }
        
        answer = new int[cnt];
        
        int j = 0;
        while(true) {
            answer[j] = n;
             if(n == 1) 
                break;
            if(n % 2 == 0) {
                n =  n / 2;
           
            } else if(n % 2 == 1) {
                n = 3 * n + 1;
 
            }
         
             j++;
           
        }
        
        System.out.println(cnt);
        System.out.println(Arrays.toString(answer));
        
        
        return answer;
    }
}