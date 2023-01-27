class Solution {
    public String solution(int n) {
        String result = "";
        for(int i =0; i < n/2; i++)
            result += "수박";
        
        // n이 홀수면 '수' 추가
        if(n%2 == 1)
            result += "수";
        return result;
    }
}