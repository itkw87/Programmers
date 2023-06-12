class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < num_list.length; i++) {
            if((i + 1) % 2 == 1) {
                oddSum += num_list[i];
            } else if((i + 1) % 2 == 0) {
                evenSum += num_list[i];
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
        
        return oddSum > evenSum ? oddSum : evenSum;
    }
}