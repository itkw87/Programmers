class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        int answer = 0;
        
        for(int i = 0; i < lines.length; i++) 
            // arr배열이 크기가 200이기 때문에 199번 인덱스까지만 사용 가능함.
            for(int j = lines[i][0] + 100; j <= lines[i][1] + 99; j++) 
                arr[j]++;
        
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] > 1) 
                answer++;
        
        return answer;
    }
}