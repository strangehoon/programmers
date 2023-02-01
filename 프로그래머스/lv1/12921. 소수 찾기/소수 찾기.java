class Solution {
    public int solution(int n) {
        int count = 0;
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    count ++;
                    break;
                }
            }
        }
        int answer = n-1 - count;
        return answer;
    }
}