import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        int result = n - lost.length;
        List<Integer> lostList = Arrays.stream(lost).boxed().sorted().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().sorted().collect(Collectors.toList());
        //여벌 체육복을 가져온 학생이 도난 당했을 경우
        for(int i = 0; i < lost.length; i++){
        
            if(reserveList.contains(lost[i])){
                reserveList.remove(Integer.valueOf(lost[i]));
                lostList.remove(Integer.valueOf(lost[i]));
                result++;
            }
        }
        for(Integer x : lostList){
            System.out.println("x = " + x);
            int left = x -1;
            int right = x + 1;

            if(reserveList.contains(left)){
                result ++;
                reserveList.remove(Integer.valueOf(left));
            }

            else if (reserveList.contains(right)) {
                result ++;
                reserveList.remove(Integer.valueOf(right));
            }

        }
        return result;
    }
}