class Solution {
    public int solution(String my_string) {
        int answer = 0;    
        String[] arr = my_string.split(" ");
        String pm = "+";
        for(int i = 0; i < arr.length; i++) {
            if("+".equals(arr[i]) || "-".equals(arr[i])) {
               if("+".equals(arr[i])) {
                   pm = "+";
               } else {
                   pm = "-";
               }
            } else {
                if("+".equals(pm)) {
                    answer =  answer + Integer.parseInt(arr[i]);
                } else {
                    answer =  answer - Integer.parseInt(arr[i]);
                }   
            }
        }
        return answer;
    }
}