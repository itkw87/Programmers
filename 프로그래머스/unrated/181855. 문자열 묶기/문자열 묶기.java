import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int[] intArr = new int[30];
        for(int i = 0; i < strArr.length; i++) {
            intArr[strArr[i].length() - 1]++;
        }     
        Arrays.sort(intArr); 
        return intArr[intArr.length - 1];
    }
}