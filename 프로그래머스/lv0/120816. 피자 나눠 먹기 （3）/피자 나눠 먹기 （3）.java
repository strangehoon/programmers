class Solution {
    public int solution(int slice, int n) {

        int result = n/slice+1;
        if(n%slice==0)
            result--;
        return result;
    }
}