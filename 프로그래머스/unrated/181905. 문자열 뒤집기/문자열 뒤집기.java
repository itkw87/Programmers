class Solution {
    public String solution(String my_string, int s, int e) {
        return my_string.replace(my_string.substring(s, e + 1), new StringBuilder().append(my_string.substring(s, e + 1)).reverse().toString());
    }
}