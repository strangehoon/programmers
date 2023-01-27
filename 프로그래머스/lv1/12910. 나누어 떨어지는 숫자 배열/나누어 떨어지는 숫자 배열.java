import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        // 리스트 생성
        List<Integer> list= new ArrayList<>();
        
        // divisor로 나누어 떨어지는 값 리스트에 추가
        for(int element : arr){
            if(element % divisor == 0)
                list.add(element);
        }
        
        // divisor로 나누어 떨어지는 element가 하나도 없다면 리스트에 -1 담아 반환
        if (list.isEmpty())
            list.add(-1);

        int[] results = new int[list.size()];
        
        // 리스트에 있는 값들을 배열에 담기
        for (int i = 0 ; i < list.size() ; i++) {
            results[i] = list.get(i).intValue();
        }
        
        // 오름차순 정렬
        Arrays.sort(results);
        return results;
            
    }
}