class Solution {
    public int solution(String s) {
        String[] strSetArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strSetArr.length; i++) {
            s = s.replaceAll(strSetArr[i], i + "");
        }
        return Integer.parseInt(s);
    }
}