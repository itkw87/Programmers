import java.util.*;

class Solution {
    public int solution(int[] number) {
        Map<List<String>, List<Integer>>  idxMap  = new HashMap();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; i != j && j < number.length; j++) {
                for (int g = 0; g != j && g != i &&  g < number.length; g++) {
                    if (number[i] + number[j] + number[g] == 0) {
                        List<String> idxList = new ArrayList<>();
                        idxList.add(i + "");
                        idxList.add(j + "");
                        idxList.add(g + "");
                        
                        List<Integer> numList = new ArrayList<>();
                        numList.add(number[i]);
                        numList.add(number[j]);
                        numList.add(number[g]);
                        
                        idxMap.put(idxList, numList);
                    }
                }
            }
        }
        return idxMap.size();
    }
}