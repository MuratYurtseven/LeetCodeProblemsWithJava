package EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_sTriangleII {
    /*
    //0ms
     public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        list.add((int)ans);

        for(int i=0;i<rowIndex;i++){
            ans = ans*(rowIndex-i);
            ans = ans/(i+1);
            list.add((int)ans);
        }

        return list;


    }
     */

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        if(rowIndex == 0) return firstRow;

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> tempArr = new ArrayList<>();
            tempArr.add(0);
            tempArr.addAll(triangle.get(triangle.size() -1));
            tempArr.add(0);
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < tempArr.size() - 1; j++) {
                row.add(tempArr.get(j)+ tempArr.get(j+1));

            }
            triangle.add(row);
        }
        for (int i = 1; i < triangle.size(); i++) {
            if (i == rowIndex){
                return triangle.get(i);
            }
        }


        return new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }
}
