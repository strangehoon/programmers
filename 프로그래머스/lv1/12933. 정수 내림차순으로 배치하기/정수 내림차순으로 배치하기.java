import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String [] arrString = String.valueOf(n).split("");
        Arrays.sort(arrString, Comparator.reverseOrder());

        String result = String.join("", arrString);

        return Long.parseLong(result);
        
    }
}