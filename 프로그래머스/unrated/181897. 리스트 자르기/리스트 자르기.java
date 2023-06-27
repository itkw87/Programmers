class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int startIdx = 0;
        int finalIdx = num_list.length - 1;
        int plusNum = 1;
        switch(n) {
            case 1:
                finalIdx = slicer[1];
                break;    
            case 2:
                startIdx = slicer[0];
                break;
            case 3:
                startIdx = slicer[0];
                finalIdx = slicer[1];
                break;
            case 4:
                startIdx = slicer[0];
                finalIdx = slicer[1];
                plusNum = slicer[2];              
        }
        answer = new int[(finalIdx - startIdx)  / plusNum + 1];
        int j = 0;
        for(int i = startIdx; i <= finalIdx; i += plusNum) {
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}