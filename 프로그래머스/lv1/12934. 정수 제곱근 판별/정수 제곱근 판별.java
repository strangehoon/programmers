class Solution {
    public long solution(long n) {
        long result;
        double sqrt = Math.sqrt(n);
        if(sqrt - Math.round(sqrt) != 0){
            return -1;
        }
        else {
            return (long)Math.pow(sqrt+1, 2);
        }
    }
}