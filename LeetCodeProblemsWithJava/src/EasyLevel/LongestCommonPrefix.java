package EasyLevel;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String [] strings){
        String prefix = strings[0];
        for (int i = 0; i < strings.length; i++) {
            while (strings[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()){
                    return  "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String []{"flower","flow","flight"}));
    }
}
