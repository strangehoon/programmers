class Solution {
    public int solution(int n, int k) {
        int result;
        
        k -= (int)n/10;
        result = n*12000 + k*2000;

        return result;
    }
}