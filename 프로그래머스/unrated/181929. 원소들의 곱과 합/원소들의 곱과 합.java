class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int pow = 0;
        for(int i = 0; i < num_list.length; i++){
            mul *= num_list[i];
            pow += num_list[i];
        }
        if(mul<Math.pow(pow, 2)){
            return 1;
        }
        else {
            return 0;
        }
    }
}