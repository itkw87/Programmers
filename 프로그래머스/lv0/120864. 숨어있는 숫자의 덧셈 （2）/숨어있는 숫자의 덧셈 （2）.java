class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char thisChar = ' ';
        for(int i = 0; i < my_string.length(); i++) {
            thisChar =  my_string.charAt(i);
            if(('a' <= thisChar && thisChar <= 'z') || ('A' <= thisChar && thisChar <= 'Z')) {
                my_string = my_string.replace(thisChar + "", " ");
            }
        }       
        String[] strArr = my_string.trim().split(" ");

        for(int i = 0; i < strArr.length; i++) {
            if(!"".equals(strArr[i])) 
                answer += Integer.parseInt(strArr[i]);
        }
      
        return answer;
    }
}