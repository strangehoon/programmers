class Solution {
    public String solution(String my_string, int n) {
        String result = "";
        char[] arr = my_string.toCharArray();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < n; j++){
                result += arr[i];
            }
        }
        return result;
    }
}