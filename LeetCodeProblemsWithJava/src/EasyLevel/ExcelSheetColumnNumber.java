package EasyLevel;

import java.util.HashMap;

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {

        char [] chars = columnTitle.toCharArray();
        int number = 0;

        for (int i = 0; i < chars.length; i++) {
            if(number>0){
                number *= 26;
            }
            number += (chars[i] == 'A') ? 1 : 0;
            number += (chars[i] == 'B') ? 2 : 0;
            number += (chars[i] == 'C') ? 3 : 0;
            number += (chars[i] == 'D') ? 4 : 0;
            number += (chars[i] == 'E') ? 5 : 0;
            number += (chars[i] == 'F') ? 6 : 0;
            number += (chars[i] == 'G') ? 7 : 0;
            number += (chars[i] == 'H') ? 8 : 0;
            number += (chars[i] == 'I') ? 9 : 0;
            number += (chars[i] == 'J') ? 10 : 0;
            number += (chars[i] == 'K') ? 11 : 0;
            number += (chars[i] == 'L') ? 12 : 0;
            number += (chars[i] == 'M') ? 13 : 0;
            number += (chars[i] == 'N') ? 14 : 0;
            number += (chars[i] == 'O') ? 15 : 0;
            number += (chars[i] == 'P') ? 16 : 0;
            number += (chars[i] == 'Q') ? 17 : 0;
            number += (chars[i] == 'R') ? 18 : 0;
            number += (chars[i] == 'S') ? 19 : 0;
            number += (chars[i] == 'T') ? 20 : 0;
            number += (chars[i] == 'U') ? 21 : 0;
            number += (chars[i] == 'V') ? 22 : 0;
            number += (chars[i] == 'W') ? 23 : 0;
            number += (chars[i] == 'X') ? 24 : 0;
            number += (chars[i] == 'Y') ? 25 : 0;
            number += (chars[i] == 'Z') ? 26 : 0;
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
