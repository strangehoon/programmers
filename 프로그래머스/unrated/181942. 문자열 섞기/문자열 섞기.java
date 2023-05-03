class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int len1 = str1.length();
        int len2 = str2.length();

        for(int i = 0; i < len1; i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}