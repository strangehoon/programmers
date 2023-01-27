import java.util.*;

public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        int sum = 0;
        for(char element : arr) {
            sum += element -'0';
        }

        return sum;
    }
}