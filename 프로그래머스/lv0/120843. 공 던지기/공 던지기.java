import java.util.Arrays;
class Solution {
    public int solution(int[] numbers, int k) { 
        int len = k * 2 - 1;
        int forCnt = len % numbers.length == 0 ? len / numbers.length : (len / numbers.length) + 1;    
        String str = "";
        for(int i = 0; i < numbers.length; i++) {
            str += numbers[i] + " ";
        }
        String newStr = "";
        for(int i = 0; i < forCnt; i++) {
            newStr += str.substring(0, str.length());
        }
        return Integer.parseInt(newStr.trim().split(" ")[len - 1]);
    }
} 