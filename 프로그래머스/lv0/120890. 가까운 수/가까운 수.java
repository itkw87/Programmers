import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                return answer = n;
            }
        }
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = n;
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                if(i == 0) {
                    answer = array[i + 1];    
                } else if(i == array.length - 1) {
                    answer = array[i - 1];
                } else {
                    if(n - array[i - 1] > array[i + 1] - n) {
                        answer = array[i + 1];
                    } else if(n - array[i - 1] < array[i + 1] - n) {
                        answer = array[i + 1];
                    } else {
                        answer = array[i - 1] >= array[i + 1] ? array[i + 1] : array[i - 1];
                    }
                }
            }
        }
        return answer;
    }
}