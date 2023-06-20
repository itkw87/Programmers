class Solution {
    public int solution(int num, int k) {
        return ("" + num).indexOf(k + "") == -1 ? ("" + num).indexOf(k + "") : ("" + num).indexOf(k + "") + 1;
    }
}