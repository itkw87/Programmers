class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        
        System.out.println(my_string.indexOf(target));
        
        if(my_string.indexOf(target) != -1) {
            answer = 1;
        } 
        
        return answer;
    }
}