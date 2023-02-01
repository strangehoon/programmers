class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i =1; i <= Math.sqrt(n); i++) {
            if (i * i == n)
                sum += i;
            else if (n % i == 0)
                sum = sum + i + n/i;
        }
        return sum;
    }
}