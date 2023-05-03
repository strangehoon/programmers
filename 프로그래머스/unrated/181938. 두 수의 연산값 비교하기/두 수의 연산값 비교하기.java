class Solution {
    public int solution(int a, int b) {
        int first = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int second = a*b*2;

        if(first >= second){
            return first;
        }
        else {
            return second;
        }
    }
}