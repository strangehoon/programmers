class Solution {
    public int solution(int n) {
        String num = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(num);
        String reverse = sb.reverse().toString();
        int answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}