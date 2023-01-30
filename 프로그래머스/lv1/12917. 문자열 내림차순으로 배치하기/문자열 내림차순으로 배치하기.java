import java.util.*;
class Solution {
    public String solution(String s) {
        List<Character> list = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            list.add(currentCharacter);
        }
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Character item : list) {
            sb.append(item);
        }
        return sb.toString();
    }
}