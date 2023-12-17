class Solution {
    public int solution(int n) {
        int i = 0;
        int nextNum = 0;
        String numOneInBinaryStringNextNum = "";
        String numOneInBinaryStringN = Integer.toBinaryString(n).replace("0", "");
        while (!numOneInBinaryStringNextNum.equals(numOneInBinaryStringN)) {
            nextNum = n + (++i);
            numOneInBinaryStringNextNum = Integer.toBinaryString(nextNum).replace("0", "");
        }
        return nextNum;
    }
}