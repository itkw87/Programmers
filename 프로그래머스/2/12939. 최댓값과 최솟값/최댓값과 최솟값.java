import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            list.add(Integer.parseInt(strArr[i]));
        }
        Collections.sort(list);
        return list.get(0) + " " + list.get(list.size() - 1);  
    }
}