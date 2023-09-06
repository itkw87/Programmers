import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String arr1I = toFQNBinaryStr(arr1[i], n);
            String arr2I = toFQNBinaryStr(arr2[i], n);
            String conversionBinary = "";
            for(int j = 0; j < n; j++) {
                if("1".equals(arr1I.charAt(j) + "") || "1".equals(arr2I.charAt(j) + "")) 
                    conversionBinary += "#";
                else if("0".equals(arr1I.charAt(j) + "") && "0".equals(arr2I.charAt(j) + "")) 
                    conversionBinary += " ";
            }
            list.add(conversionBinary);
        }
        return list.toArray(new String[0]);
    }
    public String toFQNBinaryStr(int num, int n) {
        String binaryString = Integer.toBinaryString(num);
        int cnt = 0;
        if((cnt = n - binaryString.length()) > 0) 
            for (int i = 0; i < cnt; i++) 
                binaryString = 0 + binaryString;
        return binaryString;
    }
}