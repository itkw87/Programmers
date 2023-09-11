class Solution {
    public String solution(String s) {
        return s.length() % 2 == 1 ? s.toCharArray()[s.length() / 2] + "" : s.toCharArray()[(s.length() / 2) - 1] + "" + s.toCharArray()[s.length() / 2];
    }
}