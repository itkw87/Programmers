import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        List<String> idList = new ArrayList<>(Arrays.asList(id_list));
        for (int i = 0; i < report.length; i++) {
            String[] reportArr = report[i].split(" ");
            String reporter = reportArr[0];
            String reported = reportArr[1];
            Set<String> reporterSet = map.getOrDefault(reported, new HashSet<String>());
            reporterSet.add(reporter);
            map.put(reported, map.getOrDefault(reported, reporterSet)) ;
        }
        Iterator<Set<String>> allReporterSetIt = map.values().iterator();
        while(allReporterSetIt.hasNext()) {
            Set<String> perReporterSet = allReporterSetIt.next();
            if (perReporterSet.size() >= k) {
                 Iterator<String> perReporterSetIt = perReporterSet.iterator();
                 while(perReporterSetIt.hasNext()) {
                    int reporterIdIndex = idList.indexOf(perReporterSetIt.next());
                     if (reporterIdIndex != -1) {
                         answer[reporterIdIndex]++;
                     }
                }
            }
        }
        return answer;
    }
}