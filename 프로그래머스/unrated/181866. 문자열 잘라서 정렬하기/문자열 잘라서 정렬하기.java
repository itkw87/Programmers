import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        // String str = "xaxxbxxxcxxdxxxx";
        
        myString = myString.replaceAll("x{2,}" ,"x");
        // System.out.println(myString);
        if(myString.charAt(0) == 'x') {
            myString = myString.substring(1, myString.length());
        }
       

  
        String[] answer = myString.split("x");
        
        // System.out.println(Arrays.toString(answer));
        
        Arrays.sort(answer);
        // System.out.println(Arrays.toString(answer));
        
        
   
        return answer;
    }
}

