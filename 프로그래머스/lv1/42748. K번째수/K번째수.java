import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        List<Integer> result = new ArrayList<>();
        for(int i =0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            int x = list.get(commands[i][2]-1);
            result.add(x);
        }
        int size = result.size();
        
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}