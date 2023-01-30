import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> setNum = new HashSet<Integer>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                setNum.add(numbers[i] + numbers[j]);
            }
        }
        int[] result = setNum.stream().sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        return result;
    }
}