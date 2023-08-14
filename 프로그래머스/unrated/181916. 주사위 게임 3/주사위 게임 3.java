import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d));
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Integer[] numArr = map.keySet().toArray(new Integer[0]); // 나온수
        Integer[] cntArr = map.values().toArray(new Integer[0]); // 중복수
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        switch(map.size()) {
            case 1:
                return 1111 * numArr[0];
            case 2:
                if(cntArr[0] == cntArr[1])  // 같은 수가 2개인데 그 2개가 2개씩 나왔을때
                    return (numArr[0] + numArr[1]) * Math.abs((numArr[0] - numArr[1]));
                else 
                    return cntArr[0] > cntArr[1] ? (10 * numArr[0] + numArr[1]) * (10 * numArr[0] + numArr[1]) : (10 * numArr[1] + numArr[0]) * (10 * numArr[1] + numArr[0]);         
            case 3:
                int maxCnt = Collections.max(map.values());
                int product  = 1;
                
                for (int num : numArr) {
                    if (map.get(num) != maxCnt) {
                        product  *= num;
                    }
                }
                return product ;
            case 4:
                return Collections.min(map.keySet());          
        }
        return 0;
    }
}