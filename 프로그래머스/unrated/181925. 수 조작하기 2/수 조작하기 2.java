class Solution {
    public String solution(int[] numLog) {
    
        int[] arr = new int[numLog.length-1];
        String answer = "";
        for(int i = 0;i<arr.length;i++){
            arr[i] = numLog[i+1]-numLog[i];
        }
        for(int i = 0; i <arr.length; i++){
            switch (arr[i]){
                case 1:
                    answer += "w";
                    break;
                case -1:
                    answer += "s";
                    break;
                case 10:
                    answer += "d";
                    break;
                case -10:
                    answer += "a";
                    break;
            }
        }
        return answer;
    }
}