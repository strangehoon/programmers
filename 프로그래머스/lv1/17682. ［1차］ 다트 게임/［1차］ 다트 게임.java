import java.util.Arrays;
class Solution {
    public int solution(String dartResult) {
        int [] intArr = new int[dartResult.length()];
        char[] chArr = dartResult.toCharArray();
        int index = 0;
        for(int i = 0; i < chArr.length; i++){
            if ( (chArr[i] == '1') && (chArr[i+1] == '0')){
                intArr[index++] = 10;
                i++;
            }

            else if ((chArr[i] >= '0') && (chArr[i] <= '9'))
                intArr[index++] = chArr[i] - '0';
            
            else if (chArr[i] == 'S')
                continue;
            else if (chArr[i] == 'D')
                intArr[index-1] = (int)Math.pow(intArr[index-1], 2);
            
            else if (chArr[i] == 'T') 
                intArr[index-1] = (int)Math.pow(intArr[index-1], 3);
            
            else if (chArr[i] == '*') {
                if(i == 2)
                    intArr[0] *= 2;
                else {
                    intArr[index-2] *= 2;
                    intArr[index-1] *= 2;
                }
            }
            else if (chArr[i] == '#') 
                intArr[index-1] *= -1;
        }
        return Arrays.stream(intArr).sum();
    }
}