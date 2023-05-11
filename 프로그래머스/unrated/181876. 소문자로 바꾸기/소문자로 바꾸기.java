class Solution {
    public String solution(String myString) {
        char[] arr = myString.toCharArray();
        String answer = "";
        for(char x : arr){
            if(Character.isUpperCase(x)){
                answer+= Character.toLowerCase(x);
            }
            else {
                answer+=x;
            }
        }
        return answer;
    }
}