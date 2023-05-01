import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char []arr = a.toCharArray();
        String result = "";
        for(char ch : arr){
            if((65<= ch) && (ch <=90)){
                ch = (char)(ch+32);
            } else if ((97 <= ch) && (ch <= 122)) {
                ch = (char)(ch-32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}