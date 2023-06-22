class Solution {
    public String solution(String my_string) {
        String str = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            if(str.indexOf(my_string.charAt(i) + "") == -1) 
                str += my_string.charAt(i) + "";
        }

        return str;
    }
}