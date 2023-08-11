import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        if(balls - share == 0) {
            return 1;
        } else {
            return factorial(new BigInteger(balls + ""), new BigInteger("1")).
                        divide(factorial(new BigInteger((balls - share) + ""), new BigInteger("1")).
                        multiply(factorial(new BigInteger(share + ""), new BigInteger("1")))).intValue();
        }
        
    }
    public BigInteger factorial(BigInteger n, BigInteger num) {
        num = num.multiply(n);
        n =  n.subtract(new BigInteger("1"));
        if(n.compareTo(new BigInteger("1")) >= 0) 
            num = factorial(n, num);
        return num;
    }
}