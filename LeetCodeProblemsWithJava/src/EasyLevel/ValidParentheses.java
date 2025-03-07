package EasyLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String S){
        Map<Character,Character> valmap = new HashMap<>();
        valmap.put('(',')');
        valmap.put('{','}');
        valmap.put('[',']');
        Stack<Character> chars = new Stack<>();
        for (Character c : S.toCharArray()){
            if (valmap.containsKey(c)){
                chars.push(c);
            }
            else {
                if (chars.isEmpty() || valmap.get(chars.pop()) != c){
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{()[]{[]}}"));
    }
}
