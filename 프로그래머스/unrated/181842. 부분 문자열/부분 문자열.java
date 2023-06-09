class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        System.out.println(str2.indexOf(str1));
        
        answer = str2.indexOf(str1) != -1 ?  1 : 0;
        
        
        return answer;
    }
}