import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < sizes.length; i++){
            //행마다 최소값 list에 추가
            if(sizes[i][0] > sizes[i][1])
                list.add(sizes[i][1]);
            else 
                list.add(sizes[i][0]);
            // 전체 배열에서 최대값 구하기
            for(int j = 0; j <= 1; j++) {
                if(max < sizes[i][j])
                    max = sizes[i][j];
            }
        }
        //행마다 최소값 중 최대값 곱하기 전체 배열 최대값
        return Collections.max(list)*max;
        
    }
}
