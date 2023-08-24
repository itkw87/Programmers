class Solution {
    public int solution(int num) {
         if(num == 1) 
            return 0;
        long realNum = num;
        int i = 0;
        while(i++ < 500 && realNum > 1) {
            realNum = (realNum % 2) == 0 ? realNum / 2 : (realNum * 3) + 1;    
            if(1 == realNum) 
                break;
        }
        return realNum == 1 ? i : -1;
    }
}