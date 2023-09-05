import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList();
        for (int num : arr) 
            list.add(num);
        list.remove(Collections.min(list));
        if(list.isEmpty()) 
            list.add(-1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}