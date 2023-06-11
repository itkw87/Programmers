import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1 ];
        
        System.out.println("length / n:" + num_list.length / n);
        System.out.println("length % n:" + num_list.length % n);
        System.out.println("num_list.length :" + answer.length);
        System.out.println("answer.length :" + answer.length);
        
        int answerIdx = 0;
        for(int i = 0; i < num_list.length; i += n) {
            answer[answerIdx] = num_list[i];
            answerIdx++;
        }
        
        System.out.println(Arrays.toString(answer));
       
        
        return answer;
    }
}