package EasyLevel;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInteger(String romanNums){
        Map<Character,Integer> romanNumsMap = new HashMap<>();
        romanNumsMap.put('I',1);
        romanNumsMap.put('V',5);
        romanNumsMap.put('X',10);
        romanNumsMap.put('L',50);
        romanNumsMap.put('C',100);
        romanNumsMap.put('D',500);
        romanNumsMap.put('M',1000);
        int result = 0;
        char [] chars = romanNums.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(romanNumsMap.containsKey(chars[i])){
                if (i>=1 && (romanNumsMap.get(chars[i]) > romanNumsMap.get(chars[i-1]))){
                    result += romanNumsMap.get(chars[i]) - (romanNumsMap.get(chars[i-1]) * 2);
                }
                else {
                    result += romanNumsMap.get(chars[i]);
                }
            }
        }

        return  result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("MCMXCIV"));
    }
}
