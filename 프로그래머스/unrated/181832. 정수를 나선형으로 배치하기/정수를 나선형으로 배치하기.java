import java.util.*;

class Solution {
    int num = 1;
    int finalRow = 0;
    int finalCol = -1;
    
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean flag = false;
        
        while(num <= n * n) { 
            flag = true;
            for(int direction = 1; direction <= 4; direction++) {
                 porxyFuction(direction, answer);
            }
           

            for(int i = 0; i < answer.length; i++) {
                for(int j = 0; j < answer[i].length; j++) {
                    if(answer[i][j] == 0) {
                        flag = false;
                    }
                }
            }

        }

        return answer;
    }
    
    
    
    public void porxyFuction(int direction, int[][] d2Arr) {
        if(direction == 1) {
            for(int j = finalCol + 1; j < d2Arr[finalRow].length && d2Arr[finalRow][j] == 0; j++) {
                d2Arr[finalRow][j] = num++;
                finalCol = j;
            }
        }
        if(direction == 1) {
            for(int i = finalRow + 1; i < d2Arr[finalRow].length && d2Arr[i][finalCol] == 0; i++) {
                d2Arr[i][finalCol] = num++;
                finalRow = i;
            }
        }
        if(direction == 3) {
            for(int j = finalCol - 1; j >= 0 && d2Arr[finalRow][j] == 0; j--) {
                d2Arr[finalRow][j] = num++;
                finalCol = j;
            }
        }
        if(direction == 4) {
            for(int i = finalRow - 1; i >= 0  && d2Arr[i][finalCol] == 0; i--) {
                d2Arr[i][finalCol] = num++;
                finalRow = i;
            }
        }
    }
 

}