class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] intArr = new int[numlist.length];
        for(int i = 0; i < numlist.length; i++) {
          answer[i] = numlist[i] - n;
        }
        int temp;
        boolean flag;
        do {
            temp = 0;
            flag = true;
            for(int i = 0; i < answer.length - 1; i++) {
                if(Math.abs(answer[i]) > Math.abs(answer[i + 1])) {
                    temp = answer[i];
                    answer[i] = answer[i + 1];
                    answer[i + 1] = temp;
                    flag = false;
                } else if(Math.abs(answer[i]) == Math.abs(answer[i + 1]) && answer[i] < answer[i + 1]) {
                    temp = answer[i];
                    answer[i] = answer[i + 1];
                    answer[i + 1] = temp;
                }
            }
        } while (!flag);
        for(int i = 0; i < numlist.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(numlist[i] - n == answer[j]) {
                    intArr[j] = numlist[i];
                }
            }
        }
        return intArr;
    }
}




