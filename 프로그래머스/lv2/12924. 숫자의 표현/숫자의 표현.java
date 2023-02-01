class Solution {
    public int solution(int n) {
        //자기 자신 카운트
        int count = 1;

        //절반만 검사
        for(int i = n/2+1; i >1; i--){
            int total = i;
            for(int j = i-1; j > 0; j--) {
                total += j;
                    
                if (total== n){
                    count++;
                    break;
                }
                else if (total > n) {
                    break;
                }
            }
        }
        return count;
    }
}