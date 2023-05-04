class Solution {
    public String solution(String code) {

        char[] arr = code.toCharArray();
        String ret = "";
        int mode = 0;
        for(int i = 0; i < arr.length; i++){
            if((mode==0) && (arr[i]=='1')){
                mode = 1;
            }
            else if ((mode==0)&&(arr[i]!='1')&&(i%2==0)) {
                ret += arr[i];
            }
            else if ((mode==1)&&(arr[i]=='1')){
                mode = 0;
            }
            else if ((mode==1)&&(arr[i]!='1')&&(i%2!=0)){
                ret += arr[i];
            }
        }
        if(ret.length()==0){
            return "EMPTY";
        }
        return ret;
    }
}