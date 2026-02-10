import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        
        int extIdx = Arrays.asList("code", "date", "maximum", "remain").indexOf(ext);
        int sortIdx = Arrays.asList("code", "date", "maximum", "remain").indexOf(sort_by);
        
        int newArrIdx = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIdx] < val_ext) {
                list.add(data[i]);
            }
        }
        list.sort((o1, o2) -> o1[sortIdx] - o2[sortIdx]);

        return list.toArray(new int[list.size()][]);
        
    }
}