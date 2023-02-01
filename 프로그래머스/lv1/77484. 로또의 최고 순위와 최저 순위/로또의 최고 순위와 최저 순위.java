class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int collect = 0;
        int zero = 0;
        int []solution = new int[2];
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j])
                    collect ++;
            }
        }
        // 등수 == 틀린 개수 +1
        // 틀린개수 + 1 == 전체 - 맞은 개수 + 1
        solution[0] = lottos.length -collect -zero +1;
        solution[1] = lottos.length -collect + 1;
        // 7등은 없다. 6등으로 처리
        if(solution[0] == 7)
            solution[0]--;
        if(solution[1] == 7)
            solution[1]--;
        return solution;
    }
}