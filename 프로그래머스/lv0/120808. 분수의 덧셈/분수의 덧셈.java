class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int denomLcd = lcd(denom1, denom2);
        int []result = new int[2];
        numer1 = denomLcd/denom1*numer1;
        denom1 = denomLcd;
        numer2 = denomLcd/denom2*numer2;
        denom2 = denomLcd;

        int denomResult = denom1;
        int numerResult = numer1 + numer2;

        int gcd = gcd(denomResult, numerResult);
        denomResult = denomResult/gcd;
        numerResult = numerResult/gcd;
        result[0] = numerResult;
        result[1] = denomResult;
        return result;
    }
    public static int gcd(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    public static int lcd(int num1, int num2){
        return num1*num2/gcd(num1,num2);
    }
}