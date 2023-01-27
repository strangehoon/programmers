class Solution {
    public String solution(int a, int b) {
        String week[] = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"}; 
        int dayNum[] ={0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        
        for(int i = 1; i <= a; i++) {
            days += dayNum[i-1];
        }
        days += b;
        String result = week[days % 7];
        return result;
    }
}