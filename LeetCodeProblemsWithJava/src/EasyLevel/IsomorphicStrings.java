package EasyLevel;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();
        Map<Character,Character> map = new HashMap<>();

        for (int i = 0; i < sArr.length; i++) {
            if (map.containsKey(sArr[i])){
                if (map.get(sArr[i]) != tArr[i]){
                    return false;
                }
            }
            else if (map.containsValue(tArr[i])){
                if(sArr[i] != sArr[i-1]){
                    return false;
                }
            }
            map.put(sArr[i],tArr[i]);
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper","title"));
    }
}
