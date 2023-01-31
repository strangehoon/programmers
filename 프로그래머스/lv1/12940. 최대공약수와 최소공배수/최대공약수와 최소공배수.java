class Solution {
    public int[] solution(int n, int m) {
        int []result = new int[2];
        result[0] = gcd(n, m);
        result[1] = lcd(n,m);
        return result;
    }
    public static int gcd(int n, int m){
        if(n<m){
            int temp = n;
            n = m;
            m = temp;
        }
        while(m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    public static int lcd(int n, int m){
        return n * m / gcd(n, m);
    }
}