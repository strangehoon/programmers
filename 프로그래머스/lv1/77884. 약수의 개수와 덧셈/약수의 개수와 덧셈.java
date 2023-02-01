class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <=right; i++){
            if(checkEven(i))
                answer += i;
            else
                answer -= i;
        }
        return answer;
    }

    public static boolean checkEven(int x){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(x); i++){
            if(i*i == x)
                count ++;
            else if (x % i == 0) {
                count +=2;
            }
        }
        if(count % 2 == 0)
            return true;
        else
            return false;
    }
}