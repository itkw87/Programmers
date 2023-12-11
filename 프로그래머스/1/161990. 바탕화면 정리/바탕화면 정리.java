import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int[] maxUp = {wallpaper.length, -1};
        int[] maxDown = {-1, wallpaper.length};
        int[] maxLeft = {-1, wallpaper[0].length()};
        int[] maxRight = {wallpaper[0].length(), -1};
        for (int i = 0; i < wallpaper.length; i++) {
            int fileIdxCol = wallpaper[i].indexOf("#");
            if (fileIdxCol != -1) {
                if (maxUp[0] > i) {
                    maxUp[0] = i;
                    maxUp[1] = fileIdxCol;
                }
                if (maxDown[0] < i) {
                    maxDown[0] = i;
                    maxDown[1] = fileIdxCol;
                }
                char[] paperPice = wallpaper[i].toCharArray();
                for (int j = 0; j < paperPice.length; j++) {
                    if (paperPice[j] == '#') {
                        if (maxLeft[1] > j) {
                            maxLeft[1] = j;
                            maxLeft[0] = i;
                        } 
                        if (maxRight[1] < j) {
                            maxRight[1] = j;
                            maxRight[0] = i;
                        }
                    }
                }
            }
        }
        return new int[] {maxUp[0], maxLeft[1], maxDown[0] + 1, maxRight[1] + 1};
    }
}