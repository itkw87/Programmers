import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        
        int temp = 0;
        String str = "";
        // str = "right".equals(direction) ? "+1" : "-1"; 
        
        if("left".equals(direction)) {
            for(int i = 0; i < numbers.length - 1; i++) {
                temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = temp;
             }
        } else {
             for(int i = numbers.length - 1; i > 0; i--) {
                temp = numbers[i - 1];
                numbers[i - 1] = numbers[i];
                numbers[i] = temp;
             }
        }
        
        
        System.out.println(Arrays.toString(numbers));
        
        return numbers;
    }
}