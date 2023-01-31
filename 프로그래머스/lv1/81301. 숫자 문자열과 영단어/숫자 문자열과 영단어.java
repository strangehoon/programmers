import java.util.*;
class Solution {
    public int solution(String s) {
        String[] list = s.split("");
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");


        for(int i = 0; i < list.length; i++){
            if(isNumeric(list[i])){
                result.append(list[i]);
                continue;
            }
            else {
                sb.append(list[i]);
            }
            String alpha = map.get(sb.toString());
            if(alpha != null){
                result.append(alpha);
                sb.delete(0, sb.length());
            }
        }
        return Integer.parseInt(result.toString());

    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }
}