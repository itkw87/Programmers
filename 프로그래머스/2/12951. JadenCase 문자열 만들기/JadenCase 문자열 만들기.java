import java.util.*;
class Solution {
    public String solution(String s) {
        String prevStr = " ";
        String[] sArr = s.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            String currStr = sArr[i];
            if (" ".equals(prevStr) && !" ".equals(currStr)) {
                sb.append(currStr.toUpperCase());
            } else {
                sb.append(currStr.toLowerCase());
            }
            prevStr = currStr;
        }
        return sb.toString();
    }
}