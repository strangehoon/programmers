class Solution {
    public String solution(String s) {
        String[] strArr = s.split("");
        int flag = 0;

        for(int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(" "))
            {
                flag = 0;
            }
            else if (!strArr[i].equals(" "))
            {
                if(flag % 2 == 0) {
                    strArr[i] = strArr[i].toUpperCase();
                } else if (flag % 2 == 1) {
                    strArr[i] = strArr[i].toLowerCase();
                }
                flag ++;
            }
        }
        return String.join("", strArr);

    }
}