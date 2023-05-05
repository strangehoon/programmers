import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int[] result = Arrays.stream(array).sorted().toArray();
        return (result[array.length/2]);
    }
}