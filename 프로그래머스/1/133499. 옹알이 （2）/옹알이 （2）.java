class Solution {
    public int solution(String[] babbling) {
      int answer = 0;
        for (String babb : babbling) {
            babb = babb.replaceAll("ayaaya|yeye|woowoo|mama", "X");
            babb = babb.replaceAll("aya|ye|woo|ma", "");
            if (babb.isEmpty())
                answer++;
        }
        return answer;
    }
}
