import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        List<String> list = Arrays.asList(arr);
        Collections.sort(list, Collections.reverseOrder());
        String answer = String.join("",list);
        return answer;
    }
}