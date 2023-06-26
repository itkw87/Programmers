class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        String str = "";
        for(int i = 0; i < flag.length; i++) {
            if(flag[i] == true) {
                for(int j = 0; j < arr[i] * 2; j++) {
                     str += arr[i];
                }
            } else {
                str = str.substring(0, str.length() - arr[i]);
            }
        }
        answer = new int[str.length()];
        for(int g = 0; g < answer.length; g++) {
            answer[g] = Integer.parseInt((str.charAt(g) + ""));
        }
        return answer;
    }
}