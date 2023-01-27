class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        int[] intArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            intArr[arr.length -i -1] = arr[i] -'0';
        }
        return intArr;
    }
}