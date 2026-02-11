import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean isHasNotPrefix = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            int nextIdx = i + 1;
            if (nextIdx < phone_book.length && phone_book[nextIdx].startsWith(phone_book[i])) {
                isHasNotPrefix = false;
            }
        }
        return isHasNotPrefix;
    }
}