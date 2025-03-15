package EasyLevel;

import java.util.ArrayList;
import java.util.List;

public class NumberOf1Bits {

    public static int hammingWeight(int n) {
        int result = 0;
        while (n>0){
            if((n&1) == 1){
                result +=1;
            }
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(2147483645));
    }
}
