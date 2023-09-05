import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i <= 9; i++) {
            if(Arrays.toString(numbers).contains(i + "")) {
                System.out.println(i + "는 포함하고 있다.");
            } else {
                System.out.println(i + "는 포함하지 않는다.");
                answer += i;
            }
        }
        
        System.out.println(answer);
        
        return answer;
    }
}