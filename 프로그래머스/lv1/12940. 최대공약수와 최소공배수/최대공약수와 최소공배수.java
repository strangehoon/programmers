class Solution {
    public int[] solution(int n, int m) {
        int []result = new int[2];
        result[0] = gcd(n, m);
        result[1] = lcd(n,m);
        return result;
    }
    //최대공약수(유클리드 호제법)
    public static int gcd(int n, int m){
        if (m == 0){
            return n;
        }
        return gcd(m, n % m);
    }
    //최소공배수
    public static int lcd(int n, int m){
        return n * m / gcd(n, m);
    }
}