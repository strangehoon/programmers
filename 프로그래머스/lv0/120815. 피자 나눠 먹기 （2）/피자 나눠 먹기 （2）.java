class Solution {
    public int solution(int n) {

        int result = lcd(n,6) /6;
        return result;
    }
    
    public static int gcd(int n, int m){
        if(m == 0)
            return n;
        return gcd(m, n%m);
    }
    
    public static int lcd(int n, int m){
        return n*m/gcd(n,m);
    }
}