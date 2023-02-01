class Solution {
    public String solution(String new_id) {
        String first_id = firstStage(new_id);
        String second_id = secondStage(first_id);
        String third_id = thirdStage(second_id);
        String fourth_id = fourthStage(third_id);
        String fifth_id = fifthStage(fourth_id);
        String sixth_id = sixthStage(fifth_id);
        String seventh_id = seventhStage(sixth_id);
        return seventh_id;
    }
    
    public static String firstStage(String str){
        return str.toLowerCase();
    }
    public static String secondStage(String str) {
        return str.replaceAll("[^a-z0-9-_.]", "");
    }
    public static String thirdStage(String str) {
        return str.replaceAll("[.]{2,}", ".");
    }
    public static String fourthStage(String str) {
        return str.replaceAll("^[.]|[.]$", "");
    }
    public static String fifthStage(String str) {
        if(str.isEmpty())
            str = "a";
        return str;
    }
    public static String sixthStage(String str) {
        if(str.length() >= 16){
            str =  str.substring(0, 15);
            if(str.charAt(str.length()-1) == '.')
                str = str.substring(0, 14);
        }
        return str;
    }
    public static String seventhStage(String str) {
        while(str.length() < 3){
            char ch = str.charAt(str.length()-1);
            str = str + ch;
        }
        return str;
    }
}