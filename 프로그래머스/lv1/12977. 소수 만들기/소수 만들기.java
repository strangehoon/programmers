class Solution {
    public int solution(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j +1; k < nums.length; k++){
                    if(check(nums[i], nums[j], nums[k])){
                        count ++;
                    }
                }
            }
        }
        return count;
    }
    public static boolean check(int x, int y, int z){
        int n = x + y + z;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}