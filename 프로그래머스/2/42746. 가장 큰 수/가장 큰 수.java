import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = numbers[i] + "";
        }
        Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
            
        if ("0".equals(strNumbers[0])) return "0";
        
        return String.join("", strNumbers);
    }
}