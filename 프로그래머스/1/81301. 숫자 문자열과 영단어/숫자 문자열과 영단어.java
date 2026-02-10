class Solution {
    public int solution(String s) {
        String[] strNumArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strNumArr.length; i++) {            
            s = s.replace(strNumArr[i], i + "");
        }
        return Integer.parseInt(s);
    }
}