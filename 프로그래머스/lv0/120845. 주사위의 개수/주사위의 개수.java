class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        System.out.println(box[0] / n);
        System.out.println(box[1] / n);
        System.out.println(box[2] / n);
        
        int[] intArr = new int[box.length];
        for(int i = 0; i < box.length; i++) {
            intArr[i] = box[i] / n;
        }
        
        for(int i = 0; i < intArr.length; i++) {
            answer *= intArr[i];
        }
        
        return answer;
    }
}