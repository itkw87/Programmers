import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> scoreMap = new LinkedHashMap<>();
        String[] keys = {"R", "T", "C", "F", "J", "M", "A", "N"};
        int[] disagreePointArr = {0, 3, 2, 1, 0, 0, 0, 0};
        int[] agreePointArr = {0, 0, 0, 0, 0, 1, 2, 3};
        
        for (String key : keys) {
            scoreMap.put(key, 0);
        }
        
        Map<String, Integer> dissagreeMap = new HashMap<>();
        Map<String, Integer> agreeMap = new HashMap<>();
        for (int i = 0; i < choices.length; i++) {
            String dissagreeCharStr = survey[i].charAt(0) + "";
            String agreeCharStr = survey[i].charAt(1) + "";
            dissagreeMap.put(dissagreeCharStr, dissagreeMap.getOrDefault(dissagreeCharStr, 0) + disagreePointArr[choices[i]]);
            agreeMap.put(agreeCharStr, agreeMap.getOrDefault(agreeCharStr, 0) + agreePointArr[choices[i]]);
        }
        
        Set<String> keySet = scoreMap.keySet();
        int count = 1;
        String prevKey = "";
        String currentKey = "";
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            currentKey = it.next();
            int dissagreeScore = dissagreeMap.containsKey(currentKey) ? dissagreeMap.get(currentKey) : 0;
            int agreeScore = agreeMap.containsKey(currentKey) ? agreeMap.get(currentKey) : 0;
            scoreMap.put(currentKey, dissagreeScore + agreeScore);
            if (!"".equals(prevKey) && count % 2 == 0) {
                 if (scoreMap.get(prevKey) > scoreMap.get(currentKey)) {
                    answer += prevKey;
                } else if (scoreMap.get(prevKey) < scoreMap.get(currentKey)) {
                    answer += currentKey;
                } else {
                    answer += (char)Math.min((int)prevKey.charAt(0), (int)currentKey.charAt(0));
                }
            }
            prevKey = currentKey;
            count++;
        }
        return answer;
    }
}