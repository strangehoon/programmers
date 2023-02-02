import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        //graph1
        for(int i = 0; i < n; i++){
            int start = arr1[i];
            String str = "";
            for(int j = 0; j < n; j++) {
                if(start >= Math.pow(2, n-j-1)){
                    str += "1";
                    start -= Math.pow(2, n-j-1);
                }
                else {
                    str += "0";
                }
            }
            list1.add(str);
        }
        //graph2
        for(int i = 0; i < n; i++){
            int start = arr2[i];
            String str = "";
            for(int j = 0; j < n; j++) {
                if(start >= Math.pow(2, n-j-1)){
                    str += "1";
                    start -= Math.pow(2, n-j-1);
                }
                else {
                    str += "0";
                }
            }
            list2.add(str);
        }

        int[] chArr3 = new int[n];
        for(int i = 0; i < n; i++){
            int[] chArr1 = Arrays.stream(list1.get(i).split("")).mapToInt(Integer::parseInt).toArray();
            int[] chArr2 = Arrays.stream(list2.get(i).split("")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0; j < n; j++){
                chArr3[j] = chArr1[j] + chArr2[j];
                System.out.println("chArr3 = " + chArr3[j]);
                if(chArr3[j] > 0)
                    chArr3[j] = 1;
            }
            String str = Arrays.toString(chArr3).replaceAll("[^0-1]", "")
                    .replaceAll("[1]", "#").replaceAll("[0]"," ");
            list3.add(str);
        }
        String[] arr = list3.toArray(new String[0]);
        return arr;
    }
}