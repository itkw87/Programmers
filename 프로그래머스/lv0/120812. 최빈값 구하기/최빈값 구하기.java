import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int cnt = 1;
        Arrays.sort(array);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] != array[i + 1]) {
                map.put(array[i], cnt);
                cnt = 1;
            } else 
                cnt++;
        }
        map.put(array[array.length - 1], cnt);
        ArrayList<Integer> list = new ArrayList(map.values());
        Collections.sort(list, Collections.reverseOrder());
        int dupCheckNum = list.remove(0);
        if(list.contains(dupCheckNum)) 
            return -1;
        
        for(int key : map.keySet()) {
            if(map.get(key).equals(dupCheckNum)) 
                answer = key;
        }
        return answer;
    }
}