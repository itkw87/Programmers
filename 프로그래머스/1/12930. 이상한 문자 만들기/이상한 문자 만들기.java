import java.util.Arrays;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, idx = 0; i < s.length(); i++) {
            if (" ".equals(s.charAt(i) + "")) {
                idx = 0;
                sb.append(s.charAt(i));
                continue;
            }
            sb.append(idx % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i)));
            idx++;
        }
        return sb.toString();
        
    }
}