import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String [] arrString = String.valueOf(n).split("");
        Arrays.sort(arrString, Comparator.reverseOrder());

        long [] arrLong = Arrays.stream(arrString).mapToLong(Long::parseLong).toArray();

        return arrLong;
    }
}