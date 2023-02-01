import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int len = nums.length/2;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int element : nums)
            hashSet.add(element);
        int setSize = hashSet.size();
        int result = (setSize>=len) ? len:setSize;
        return result;
    }
}