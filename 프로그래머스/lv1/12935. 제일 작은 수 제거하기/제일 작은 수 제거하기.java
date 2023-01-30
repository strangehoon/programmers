import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(Collections.min(list));
        if(list.isEmpty())
            list.add(-1);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}