package EasyLevel;

import java.util.List;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;

        while (left<right){
            char lch = s.charAt(left);
            char rch = s.charAt(right);
            if(!((lch>='a' && lch<='z') || (lch>='A' && lch <= 'Z') || (lch>=0 && lch<=9))){
                left+=1;
                continue;
            }
            if (!((rch>='a' && rch <= 'z') || (rch>='A' && rch<='Z')|| (rch>=0 && rch<=9))){
                right -=1;
                continue;
            }

            if((lch == rch) || (Character.toLowerCase(lch) == Character.toLowerCase(rch))){
                left += 1;
                right -= 1;
            }
            else{
                return false;
            }
        }


        return true;
    }


    //21ms
    /*
    public static boolean isPalindrome(String s) {
        s = s.replace(',',' ');
        s = s.replace(':',' ');
        s = s.replace('!',' ');
        s = s.replace('.',' ');
        s = s.replace('@',' ');
        s = s.replace('#',' ');
        s = s.replace('_',' ');
        s = s.replace('-',' ');
        s = s.replace('?',' ');
        s = s.replace('=',' ');
        s = s.replace('"',' ');
        s = s.replace('{',' ');
        s = s.replace('}',' ');
        s = s.replace('[',' ');
        s = s.replace(']',' ');
        s = s.replace('(',' ');
        s = s.replace(')',' ');
        s = s.replace('/',' ');
        s = s.replace('\'',' ');
        s = s.replace('\\',' ');
        s = s.replace(';',' ');
        s = s.replace(':',' ');
        s = s.replace('`',' ');
        s = s.replaceAll("\\s+","");

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed: "+reversed.toLowerCase());
        System.out.println("standart: "+s.toLowerCase());
        return (reversed.toLowerCase().equals(s.toLowerCase()));
    }*/

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
