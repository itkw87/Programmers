class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String preStr = my_string.substring(0 , s) + overwrite_string;
        return my_string.length() - preStr.length() == 0 ? preStr : preStr + my_string.substring(preStr.length() , my_string.length());
    }
}