class Solution {
    public int[] solution(int[] num_list) {

        int even_num = 0;
        int odd_num = 0;
        int[] answer = new int[2];
        for(int x : num_list){
            if(x % 2 == 0){
                even_num += 1;
            }
            else
                odd_num += 1;
        }
        answer[0] = even_num;
        answer[1] = odd_num;
        return answer;
    }
}