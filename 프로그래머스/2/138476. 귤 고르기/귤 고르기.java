import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        for (int tang : tangerine) {
            map.put(tang, map.getOrDefault(tang, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            pq.add(map.get(key));
        }
        while (k > 0) {
            if (pq.peek() > k) {
                pq.poll();
                answer++;
                break;
            } else {
                k -= pq.poll();
                answer++;
            }
        }
        return answer;
    }
}