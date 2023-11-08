import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<HashSet<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int g = 0; g < nums.length; g++) {
                    boolean flag = true;
                    int num = nums[i] + nums[j] + nums[g];
                    for (int k = 2; k < num; k++) {
                        if (num % k == 0) {
                            flag = false;
                            break;
                        } 
                    }
                    if (flag) {
                        HashSet<Integer> subSet = new HashSet<>();
                        subSet.add(nums[i]);
                        subSet.add(nums[j]);
                        subSet.add(nums[g]);
                        if (subSet.size() == 3) {
                            set.add(subSet);    
                        }
                    }
                }
            }
        }
        return set.size();
    }
}