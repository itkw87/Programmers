class Solution {
    public int solution(int[][] board) {
        int[][] warnningZone = new int[board.length][board[0].length];
        int mineCnt = 0;
        int safeCnt = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
                    mineCnt++;
                    warnningZone[i][j] = 4;
                    if(j > 0) 
                        warnningZone[i][j - 1] = 4;    
                    if(j < board.length - 1) 
                        warnningZone[i][j + 1] = 4;    
                    if(i > 0) 
                        warnningZone[i - 1][j] = 4;    
                    if(i > 0 && j > 0) 
                        warnningZone[i - 1][j - 1] = 4;    
                    if(i > 0 && j < board.length - 1) 
                        warnningZone[i - 1][j + 1] = 4;    
                    if(i < board.length - 1) 
                        warnningZone[i + 1][j] = 4;    
                    if(i < board.length - 1 && j > 0) 
                        warnningZone[i + 1][j - 1] = 4;    
                    if(i < board.length - 1 && j < board.length - 1) 
                        warnningZone[i + 1][j + 1] = 4;    
                }
            }
        }
        if(mineCnt == board.length * board[0].length) {
             return 0;
        } else if(mineCnt == 0) {
             return board.length * board[0].length;
        } else {
            for(int i = 0; i < warnningZone.length; i++) {
                for(int j = 0; j < warnningZone[0].length; j++) {
                    if(warnningZone[i][j] != 4) 
                        safeCnt++;
                }
            }
            return safeCnt;
        }
    }
}