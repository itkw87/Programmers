import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] orgEmergency = Arrays.copyOf(emergency, emergency.length);
        int[] answer = new int[emergency.length];
        int temp = 0;
        boolean flag = true;
        do {
            flag = true;
            for(int i = emergency.length - 1; i >= 1;  i--) {
                temp = 0;
                if(emergency[i - 1] < emergency[i]) {
                    temp = emergency[i];
                    emergency[i] = emergency[i - 1];
                    emergency[i - 1] = temp;
                    flag = false;
                }
            }
        } while(!flag);  
        for(int i = 0; i < orgEmergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(orgEmergency[i] == emergency[j]) { 
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}