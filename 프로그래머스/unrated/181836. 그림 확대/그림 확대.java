import java.util.Arrays;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        String bigStr = "";
        String str = "";
        for(int i = 0; i < picture.length; i++) {
            str = "";
            for(int j = 0; j < picture[i].length(); j++) {
                for(int g = 0; g < k; g++) {
                    str += picture[i].charAt(j) + "";    
                }          
            }
            for(int q = 0; q < k; q++) {
                bigStr += str + " ";
            }
        }     
        return bigStr.trim().split(" ");
    }
}