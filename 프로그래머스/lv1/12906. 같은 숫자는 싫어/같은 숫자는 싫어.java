import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list1 = new ArrayList<>();
        for(int element : arr) {
            list1.add(element);
        }

        List<Integer> list2 = new ArrayList<>();

        list2.add(arr[0]);
        int check = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != check){
                list2.add(arr[i]);
                check = arr[i];
            }
        }

        int[] results = list2.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return results;
    }
}