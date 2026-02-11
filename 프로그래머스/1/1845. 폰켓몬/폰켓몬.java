import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> ctgrSet = new HashSet<>();
        
        for (int num : nums) {
            ctgrSet.add(num);
        }
        
        return nums.length / 2 < ctgrSet.size() ? nums.length / 2 : ctgrSet.size();
    }
}
