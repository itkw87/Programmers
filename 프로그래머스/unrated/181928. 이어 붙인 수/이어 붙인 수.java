class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String strLonely = "";
        String strCouple = "";
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 1) {
                strLonely += num_list[i];                
            } else if(num_list[i] % 2 == 0) {
                strCouple += num_list[i];
            }
        }
        
        answer = Integer.parseInt(strLonely) + Integer.parseInt(strCouple);
       
        return answer;
    }
}