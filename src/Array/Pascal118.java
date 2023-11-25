package Array;

import java.util.*;

//not an optimized solution
public class Pascal118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal_triangle = new ArrayList<>();

        //check for 0 rows
        if(numRows == 0) return pascal_triangle;

        //add data for 1st row

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        pascal_triangle.add(first_row);

        for(int i=1;i<numRows;i++){
            List<Integer> prev_row = pascal_triangle.get(i-1);
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prev_row.get(j-1)+prev_row.get(j));
            }
            row.add(1);
            pascal_triangle.add(row);
        }
        return pascal_triangle;
    }
}
