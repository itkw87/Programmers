class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        String arrStr = "";
        for(int i = 0; i < arr.length; i++) {
            arrStr += arr[i] + " ";
        }
        arrStr = arrStr.replace("10", "T").replace(" ", "");
        int arrLength = arrStr.indexOf("2") == arrStr.lastIndexOf("2")? 1 : arrStr.lastIndexOf("2") - arrStr.indexOf("2") + 1;

        answer = new int[arrLength];
        if(arrStr.indexOf("2") == -1) {
            answer[0] = -1;
        } else if(arrStr.indexOf("2") == arrStr.lastIndexOf("2")) {
            answer[0] = 2;
        } else {
            int j = 0;
            for(int i = arrStr.indexOf("2"); i <= arrStr.lastIndexOf("2"); i++) {
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}