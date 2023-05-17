class Solution {
    boolean solution(String s) {

        boolean answer;
        char[] ss = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        for(char x : ss){

            if((x== 'p') || (x=='P')){
                pCount+=1;
            }
            else if((x=='y') || (x=='Y')){
                yCount +=1;
            }
        }
        if(pCount==yCount){
            answer = true;
        }
        else {
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}