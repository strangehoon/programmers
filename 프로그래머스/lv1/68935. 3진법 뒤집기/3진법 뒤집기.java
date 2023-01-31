class Solution {
    public int solution(int n) {
        String num = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(num);
        String reverse = sb.reverse().toString();
        int answer = Integer.parseInt(reverse, 3);
        return answer;
    }
}