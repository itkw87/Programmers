class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int lrRange = board[0] / 2;
        int udRange = board[1] / 2;
        for(int i = 0; i < keyinput.length; i++) {
            switch(keyinput[i]) {
                case "left":
                    if(answer[0] > 0 || Math.abs(answer[0]) < lrRange) 
                        answer[0] = answer[0] - 1;
                    break;
                case "right":
                    if(answer[0] < 0 || Math.abs(answer[0]) < lrRange) 
                        answer[0] = answer[0] + 1;
                    break;
                case "up":
                    if(answer[1] < 0 || Math.abs(answer[1]) < udRange) 
                        answer[1] = answer[1] + 1;
                    break;
                case "down":
                    if(answer[1] > 0 || Math.abs(answer[1]) < udRange) 
                        answer[1] = answer[1] - 1;
            }
        }     
        return answer;
    }
}