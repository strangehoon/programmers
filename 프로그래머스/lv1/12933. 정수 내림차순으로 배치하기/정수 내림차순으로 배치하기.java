import java.util.Arrays;
import java.util.Comparator;

/////////////////// better solution(StringBuilder 활용)

class Solution {
    public long solution(long n) {
        String [] arrString = String.valueOf(n).split("");
        Arrays.sort(arrString, Comparator.reverseOrder());
        
        //StringBuilder 활용
        StringBuilder stringBuilder = new StringBuilder();
        for(String str : arrString)
            stringBuilder.append(str);
        return Long.parseLong(stringBuilder.toString());
    }
}

/////////////////// orginal solution(join 활용)

// class Solution2 {
//     public long solution(long n) {
//         String [] arrString = String.valueOf(n).split("");
//         Arrays.sort(arrString, Comparator.reverseOrder());
        
//         //join 활용
//         String result = String.join("", arrString);
//         return Long.parseLong(result);
//     }
// }