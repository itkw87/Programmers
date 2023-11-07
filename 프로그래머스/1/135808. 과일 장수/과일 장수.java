import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;    
        Arrays.sort(score);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        for (int i = score.length - 1; i >= 0;  i--) {
            subList.add(score[i]);
            if (subList.size() == m) {
                list.add(subList);
                subList = new ArrayList<>();
            }
        }
        for (List<Integer> sl : list) {
            answer += Collections.min(sl) * m;
        }
        return answer;
    }
}