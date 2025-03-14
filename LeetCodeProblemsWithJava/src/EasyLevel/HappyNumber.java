package EasyLevel;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class HappyNumber {

    public static int squareSum(int n){
        int result = 0;
        while (n>0){
            int dig = n % 10;
            result += dig * dig;
            n /= 10;
        }
        return result;
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)){
            set.add(n);
            n = squareSum(n);
        }
        return (n == 1);
    }



    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
