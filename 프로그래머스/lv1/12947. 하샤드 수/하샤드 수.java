import java.util.Arrays;
class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String str = String.valueOf(x);
        int[] arr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        for(int element : arr)
            sum += element;
        if(x % sum == 0)
            return true;
        else
            return false;
    }
}