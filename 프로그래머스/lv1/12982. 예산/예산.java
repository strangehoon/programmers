import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int total = 0;
        int count = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            if(d[i] + total <= budget) {
                count ++;
                total += d[i];
            }
        }
        return count;
    }
}