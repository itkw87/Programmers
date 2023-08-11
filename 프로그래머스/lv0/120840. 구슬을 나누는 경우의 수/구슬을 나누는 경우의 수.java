import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        if(balls - share == 0) 
            return 1;
        return factorial(new BigInteger(balls + ""), BigInteger.ONE).
                        divide(factorial(new BigInteger((balls - share) + ""), BigInteger.ONE).
                        multiply(factorial(new BigInteger(share + ""), BigInteger.ONE))).intValue();     
    }
    public BigInteger factorial(BigInteger n, BigInteger num) {
        num = num.multiply(n);
        n =  n.subtract(BigInteger.ONE);
        if(n.compareTo(BigInteger.ONE) > 0) 
            num = factorial(n, num);
        return num;
    }
}