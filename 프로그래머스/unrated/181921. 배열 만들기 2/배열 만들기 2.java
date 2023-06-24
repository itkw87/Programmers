class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {-1};  
        String str = "";
        int cnt = 0;
        for(int i = l; i <= r; i++) {
            String strNum = i + "";
            cnt = 0;
            for(int j = 0; j < strNum.length(); j++) {
                if("0".equals(strNum.charAt(j) + "") || "5".equals(strNum.charAt(j) + "")) 
                    cnt++;
            }
            if(cnt == strNum.length()) 
                str += strNum + " ";
        }
        if(str.length() > 0) {
            String[] strArr =  str.trim().split(" ");
            answer = new int[strArr.length];
        
            for(int g = 0; g < answer.length; g++) {
                answer[g] = Integer.parseInt(strArr[g]);
            }
        }
        return answer;
    }
}