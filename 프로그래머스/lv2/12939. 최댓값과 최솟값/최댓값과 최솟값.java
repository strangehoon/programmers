import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        List<Integer> list = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        int max = Collections.max(list);
        int min = Collections.min(list);
        return min + " " + max;
    }
}