class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int sumNumer = 0;
        int sumDenom = 0;
        if(denom1 == denom2) {  
            sumNumer = numer1 + numer2;
            sumDenom = denom1;
            for(int i = Math.min(sumNumer, sumDenom); i >= 2 ; i--) {
                if(sumNumer % i == 0 && sumDenom % i == 0) {
                    answer[0] = sumNumer /=  i;
                    answer[1] = sumDenom /=  i;
                    return answer;
                } 
            }
            answer[0] = sumNumer;
            answer[1] = sumDenom;
        } else { 
            sumDenom = denom1 * denom2;
            numer1 = numer1 * (sumDenom / denom1);
            numer2 = numer2 * (sumDenom / denom2);
            sumNumer = numer1 + numer2;
            loop:for(int i = Math.min(sumNumer, sumDenom); i >= 2 ; i--) {
                if(sumNumer % i == 0 && sumDenom % i == 0) {
                    sumNumer /= i ;
                    sumDenom /= i ;
                    break loop;
                }
            }
            answer[0] = sumNumer;
            answer[1] = sumDenom;
        }    
        return answer;
    }
}