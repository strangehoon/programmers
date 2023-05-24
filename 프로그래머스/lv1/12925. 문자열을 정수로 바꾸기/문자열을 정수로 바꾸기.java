class Solution {
    public int solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String result;
        char[] arr = s.toCharArray();
        if (arr[0] == '+'){
            stringBuilder.append(s.substring(1, s.length()));
        } 
        else {
            stringBuilder.append(s);
        }
        result = stringBuilder.toString();
        return Integer.parseInt(result);
    }
}