import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate parseToday = LocalDate.parse(today, formatter);
        List<Integer> answerList = new ArrayList<>();
        Map<String, Integer> termsMap = new LinkedHashMap<>();
        for (String term : terms) {
            termsMap.put(term.charAt(0) + "", Integer.parseInt(term.substring(2, term.length())));
        }
        for (int i = 0; i < privacies.length; i++) {
            String bigAlpabet = privacies[i].charAt(privacies[i].length() - 1) + "";
            String strDate = privacies[i].replace(" " + bigAlpabet, "");
            LocalDate date =  LocalDate.parse(strDate, formatter);
            LocalDate newDate = date.plusMonths(termsMap.get(bigAlpabet));
            if (parseToday.compareTo(newDate) == 0 || parseToday.compareTo(newDate) > 0) {
                answerList.add(i + 1);
            }
        }
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}