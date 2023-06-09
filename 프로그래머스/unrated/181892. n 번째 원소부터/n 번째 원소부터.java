class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n-1)];
    
       
        int j = 0;
        int i = n - 1;
        while(j < answer.length) {
            
            answer[j] = num_list[i];
            j++;
            i++;
        }
        
        return answer;
    }
}