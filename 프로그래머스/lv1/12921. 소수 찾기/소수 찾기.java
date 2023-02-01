class Solution {
    public int solution(int n) {
        //소수가 아닌 수 카운트
        int count = 0;
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j <= Math.sqrt(i); j++){
                // 
                if(i % j == 0){
                    count ++;
                    break;
                }
            }
        }
        // 1은 소수가 아니므로 한개 빼주자
        int answer = n-1 - count;
        return answer;
    }
}