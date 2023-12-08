import java.util.*;
class Solution {
    private String alpabetStr =  "abcdefghijklmnopqrstuvwxyz";
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] sCharArr = s.toCharArray();
        char[] skipCharArr = skip.toCharArray();
        String newAlpabetStr = alpabetStr; 
        for (int i = 0; i < skipCharArr.length; i++) {
            newAlpabetStr = newAlpabetStr.replace(skipCharArr[i] + "", "");
        }
        for (int j = 0; j < sCharArr.length; j++) {
            int indexInNewAlpa = newAlpabetStr.indexOf(sCharArr[j]);
            int plusIndex = indexInNewAlpa + index;
            int realIndex = newAlpabetStr.length() - 1 < plusIndex ? plusIndex % newAlpabetStr.length() : plusIndex;
            answer += newAlpabetStr.charAt(realIndex);
        }   
        return answer;
    }
}