package EasyLevel;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        String temp = "";
        char[] chars = (s.toCharArray()[s.length()-1] == ' ') ? cleanSpace(s).toCharArray() : s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != ' '){
                temp += chars[i];
            }
            else if (chars[i] == ' ' && i != chars.length - 1){
                temp = "";
            }
        }
        System.out.println("temp: "+temp);
        return temp.length();
    }

    public static String cleanSpace(String s){
        String result = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != ' ' && i != chars.length - 1){
                result += chars[i];
                if(chars[i+1] == ' '){
                    result += ' ';
                }
            }
        }
        System.out.println("result: "+result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}
