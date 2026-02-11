import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean isHasNotPrefix = true;
        Map<String, Integer> map = new HashMap<>();
        
        for (String phoneNum : phone_book) {
            map.put(phoneNum, 1);
        }
        for (String phoneNum: phone_book) {
            String tmpPhoneNum = "";
            for (int j = 0; j < phoneNum.length(); j++) {
                tmpPhoneNum += phoneNum.charAt(j);
                if (j < phoneNum.length() - 1 && map.getOrDefault(tmpPhoneNum, -1) == 1) {
                    isHasNotPrefix = false;
                }
            }
        }
        return isHasNotPrefix;
    }
}