class Solution {
    public String[] solution(String[] strArr) {      

        String str = "";
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")){
                str += strArr[i] + " ";
            }
        }
        return str.trim().split(" ");
    }
}