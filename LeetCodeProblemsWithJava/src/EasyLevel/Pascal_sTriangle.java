package EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_sTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows <= 0) return triangle;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 0; i <numRows-1 ; i++) {
            List<Integer> tempArr = new ArrayList<>();
            tempArr.add(0);
            tempArr.addAll(triangle.get(triangle.size() - 1));
            tempArr.add(0);
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < tempArr.size() - 1; j++) {
                row.add(tempArr.get(j) + tempArr.get(j+1));
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
