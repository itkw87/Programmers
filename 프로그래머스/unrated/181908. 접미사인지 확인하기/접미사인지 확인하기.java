class Solution {
    public int solution(String my_string, String is_suffix) {
    int startIdx = my_string.length() - is_suffix.length();    
    return startIdx >= 0 && is_suffix.equals(my_string.substring(startIdx)) ? 1 : 0;
    }
}