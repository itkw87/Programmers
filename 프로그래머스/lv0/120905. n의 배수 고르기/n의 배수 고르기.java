import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int arrLength = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                arrLength++;
            }
        }
        
        answer = new int[arrLength];
        
        int j = 0;
        for(int i = 0; i < numlist.length; i++) {
            if(j < arrLength) {
                if(numlist[i] % n == 0){
                    answer[j] = numlist[i];
                    j++;    
                }
            }
        }
        
        System.out.println(Arrays.toString(answer));
      
   
        
        
        
        
        
        return answer;
    }
}