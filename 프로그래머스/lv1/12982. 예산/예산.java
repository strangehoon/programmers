import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
        int result = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            if(d[i] + total <= budget) {
                result ++;
                total += d[i];
            }
        }
        return result;
    }
}