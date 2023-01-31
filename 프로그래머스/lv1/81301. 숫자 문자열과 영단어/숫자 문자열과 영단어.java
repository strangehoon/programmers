import java.util.*;
/////////////////// orginal solution(HashMap 사용)
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

/////////////////// better solution(replaceAll)

// class Solution {
//     public int solution(String s) {
//         String s = "23four5six7";
//         String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
//         String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

//         for(int i=0; i<10; i++){
//             s = s.replaceAll(alphabets[i],digits[i]);
//         }
//         return Integer.parseInt(s);
//     }
// }

