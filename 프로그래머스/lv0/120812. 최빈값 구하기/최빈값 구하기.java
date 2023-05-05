import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        Integer[] newArray =Arrays.stream(array).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(newArray));
        Map<Integer, Integer> map = new HashMap<>();

        int[] count = new int[set.size()];
        for(int i =0; i < set.size(); i++){
            count[i] = Collections.frequency(Arrays.asList(newArray), set.toArray()[i]);
            map.put((Integer) set.toArray()[i], count[i]);
        }
        int max = Collections.max(map.values());
        int x = 0;
        int result = 0;
        for(Integer k : map.keySet()){
            if(map.get(k).equals(max)){
                x++;
                result = k;
            }
        }
        if(x!=1){
            return -1;
        }
        else {
            return result;
        }

    }
}