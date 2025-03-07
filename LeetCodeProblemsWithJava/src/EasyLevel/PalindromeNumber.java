package EasyLevel;

public class PalindromeNumber {
    public  static boolean isPalindromeNumber(int x){

        if(x<0 || (x!=0 && x/10==0)){
            return false;
        }
        int reversed = 0;
        while (x>reversed){
            reversed = reversed * 10 + x%10;
            x /= 10;
        }

        return (x == reversed || (x == reversed/10));
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(1221));
    }
}
