class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++) {
            cnt = 0;
            for(int j = 0; j < my_string.length(); j++) {
                if(my_string.charAt(i) == my_string.charAt(j)) {
                    cnt++;
                }
            }
            answer[Character.isUpperCase(my_string.charAt(i)) ? my_string.charAt(i) - 'A' : my_string.charAt(i) - 'G'] = cnt;
        }
        return answer;
    }
}