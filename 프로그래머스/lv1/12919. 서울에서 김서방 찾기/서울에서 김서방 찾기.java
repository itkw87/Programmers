class Solution {
    public String solution(String[] seoul) {
        String str = "";
        for(int i = 0; i < seoul.length; i++) {
            if("Kim".equals(seoul[i])) 
                str = String.format("김서방은 %d에 있다", i); 
        }
        return str;
    }
}