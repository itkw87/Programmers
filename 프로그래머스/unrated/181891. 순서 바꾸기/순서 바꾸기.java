import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        String str = Arrays.toString(num_list).replaceAll(", ", "").substring(1, num_list.length + 1);
        String newStr = str.substring(n, num_list.length) + str.substring(0, n);

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = Integer.parseInt(newStr.charAt(i) + "");
        }
            
        return answer;
    }
}