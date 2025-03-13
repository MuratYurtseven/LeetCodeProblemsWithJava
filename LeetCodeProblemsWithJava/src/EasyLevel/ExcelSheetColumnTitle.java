package EasyLevel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelSheetColumnTitle {

    public static String convertToTitle(int columnNumber) {

        StringBuilder str = new StringBuilder();

        while (columnNumber>0){

            columnNumber -= 1;
            char chr = (char) ('A'+ (columnNumber%26)) ;
            columnNumber /= 26;
            str.append(chr);
        }

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        //System.out.println(701/26);
        //System.out.println(701%26);
        System.out.println(convertToTitle(27));


    }
}
