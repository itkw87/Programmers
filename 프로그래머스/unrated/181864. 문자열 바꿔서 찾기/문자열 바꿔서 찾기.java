class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] myArr = myString.split("");
        String newStr = "";
        for(int i = 0; i < myArr.length; i++) {
            if("A".equals(myArr[i])) {
                myArr[i] = "B";
            } else if("B".equals(myArr[i])) {
                myArr[i] = "A";
            }
            newStr += myArr[i]; 
        }
      
        if(newStr.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}