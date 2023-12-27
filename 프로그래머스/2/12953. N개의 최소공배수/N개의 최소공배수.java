import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int gcd = greatestComDiv(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }
        return lcm;
    }
    private int greatestComDiv (int num1, int num2) {
            int dividend = Math.max(num1, num2);
            int divisor = Math.min(num1, num2);
            while (divisor != 0) {
                int temp = divisor;
                divisor = dividend % divisor; 
                dividend = temp;
            }
            return dividend;
    }
}