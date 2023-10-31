import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
        Arrays.sort(strArr);
        StringJoiner sj = new StringJoiner("");
        for(int i = strArr.length - 1; i >= 0; i--) {
            sj.add(strArr[i]);
        }
        return sj.toString();
    }
}