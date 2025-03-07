package EasyLevel;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        if (haystack.isEmpty() || needle.isEmpty()){
            return -1;
        }
        String newHayStack = "";
        int k = 0;
        for (Character c: haystack.toCharArray()){
            newHayStack += c;
            if (newHayStack.length()>needle.length()){
                k += 1;
            }
            if(newHayStack.contains(needle)){
                return k;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
    }
}
