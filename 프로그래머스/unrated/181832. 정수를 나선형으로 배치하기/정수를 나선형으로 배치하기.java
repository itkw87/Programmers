import java.util.*;
class Solution {
    int num = 1;
    int finalRow = 0;
    int finalCol = -1;
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        while(num <= n * n) 
            for(int direction = 1; direction <= 4; direction++) 
                 porxyFuction(direction, answer);
        
        return answer;
    }
    
    public void porxyFuction(int direction, int[][] d2Arr) {
        int newRow = finalRow;
        int newCol = finalCol;
        switch (direction) {
            case 1: // 오른쪽
                while (newCol + 1 < d2Arr[finalRow].length && d2Arr[finalRow][newCol + 1] == 0) {
                    d2Arr[finalRow][++newCol] = num++;
                    finalCol = newCol;
                }
                break;
            case 2: // 아래
                while (newRow + 1 < d2Arr.length && d2Arr[newRow + 1][finalCol] == 0) {
                    d2Arr[++newRow][finalCol] = num++;
                    finalRow = newRow;
                }
                break;
            case 3: // 왼쪽
                while (newCol - 1 >= 0 && d2Arr[finalRow][newCol - 1] == 0) {
                    d2Arr[finalRow][--newCol] = num++;
                    finalCol = newCol;
                }
                break;
            case 4: // 위
                while (newRow - 1 >= 0 && d2Arr[newRow - 1][finalCol] == 0) {
                    d2Arr[--newRow][finalCol] = num++;
                    finalRow = newRow;
                }
                break;
            default:
                break;
        }
    }
}