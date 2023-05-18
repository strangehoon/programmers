class Solution {
    public String solution(String myString) {

        String result = "";
        char[] arr = myString.toCharArray();
        for(int i =0; i < arr.length; i++){
            if(Character.isLowerCase(arr[i])){
                arr[i] = Character.toUpperCase(arr[i]);
            }
            System.out.println("arr[i] = " + arr[i]);
        }
        result = String.valueOf(arr);
        return result;
    }
}