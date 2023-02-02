import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(int[] numbers, String hand) {
        int[] leftArr = {1, 4, 7};
        int[] rightArr = {3, 6, 9};
        int[] middleArr = {2, 5, 8, 0};
        
        List<Integer> left = Arrays.stream(leftArr).boxed().collect(Collectors.toList());
        List<Integer> right = Arrays.stream(rightArr).boxed().collect(Collectors.toList());
        List<Integer> middle = Arrays.stream(middleArr).boxed().collect(Collectors.toList());
        
        int [][] pos = new int[4][3];
        int posLx = 3;
        int posLy = 0;
        int posRx = 3;
        int posRy = 2;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            if((numbers[i] == 1) || (numbers[i] == 4) || (numbers[i] == 7)){
                list.add("L");
                posLx = left.indexOf(numbers[i]);
                posLy = 0;
            }
            else if((numbers[i] == 3) || (numbers[i] == 6) || (numbers[i] == 9)){
                list.add("R");
                posRx = right.indexOf(numbers[i]);
                posRy = 0;
            }
            else{
                int mx = middle.indexOf(numbers[i]);
                int my = 1;
                int distanceToLeft = getdistance(posLx, posLy, mx, my);
                int distanceToRight = getdistance(posRx, posRy, mx, my);
                if(distanceToRight > distanceToLeft){
                    list.add("L");
                    posLx = mx;
                    posLy = 1;
                }
                else if (distanceToRight < distanceToLeft) {
                    list.add("R");
                    posRx = mx;
                    posRy = 1;
                }
                else{
                    if(hand.equals("right")){
                        list.add("R");
                        posRx = mx;
                        posRy = 1;
                    }
                    else {
                        list.add("L");
                        posLx = mx;
                        posLy = 1;
                    }
                }
            }
        }
        String str = String.join("", list);
        return str;
    }

    public static int getdistance(int x1, int y1, int x2, int y2){
        return Math.abs(x2-x1) + Math.abs(y2-y1);
    }
}