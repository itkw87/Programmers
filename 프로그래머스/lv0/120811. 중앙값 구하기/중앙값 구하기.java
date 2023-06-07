import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int temp = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                temp = 0;
                if(array[i] < array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
      
        System.out.println(Arrays.toString(array));
        
        answer = array[array.length / 2];
        
        
        return answer;
    }
}