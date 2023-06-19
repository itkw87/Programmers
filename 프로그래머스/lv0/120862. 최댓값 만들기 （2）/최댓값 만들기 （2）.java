import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] plus = new int[2];
        int[] minus = new int[2];

        int temp = 0;
        boolean flag;
        do {
            flag = true;
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]) {
                    temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    flag = false;
                }
            }    
        } while(!flag);
        
        minus[0] = numbers[0];
        minus[1] = numbers[1];
        plus[0] = numbers[numbers.length - 1];
        plus[1] = numbers[numbers.length - 2];
        
        return minus[0] * minus[1] >= plus[0] * plus[1] ? minus[0] * minus[1] : plus[0] * plus[1];
    }
}