class Solution {
    public String solution(String s, int n) {
        
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(char ch : arr) {
            //공백일 경우
            if(ch == ' '){
                sb.append(ch);
                continue;
            }
            // z에서 a로
            else if ((ch<='Z') && (ch + n > 'Z'))
                sb.append((char)('A'-1 + ch+n -'Z'));
            // Z에서 A로
            else if ((ch<='z')&&(ch + n > 'z'))
                sb.append((char)('a'-1 + ch+n -'z'));
            // 정상인 경우
            else
                sb.append((char)(ch + n));
        }
        return sb.toString();
    }
}