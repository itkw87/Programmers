class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int num = 1;
        while(arr.length > num) {
            num = num * 2;
            System.out.println(num);
        } 
        answer = new int[num]; 

        for(int i = 0; i < answer.length; i++) {
            answer[i] = i > arr.length - 1 ? 0 : arr[i]; 
        }
        return answer;
    }
}