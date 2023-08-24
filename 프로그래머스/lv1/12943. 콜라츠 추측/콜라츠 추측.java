class Solution {
    public int solution(int num) {
        int i = 0;
        while(i < 500) {
            num = (num % 2) == 0 ? num / 2 : (num * 3) + 1;    
            i++;
            if(1 == num) {
                break;
            }
        }
        System.out.println(num);
        System.out.println(i);
        return num == 1 ? i : -1;
    }
}