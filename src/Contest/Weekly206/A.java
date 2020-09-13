package Contest.Weekly206;

import java.util.ArrayList;

public class A {
    public int numSpecial(int[][] mat) {

//        ArrayList<Integer> sp_row_list = new ArrayList<>();
//        ArrayList<Integer> sp_col_list = new ArrayList<>();
        int num_row = 0;
        int num_col = 0;

        for (int i = 0; i < mat.length; i++) {
            int sum_row = 0;
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                sum_row += row[j];
            }
            if(sum_row == 1) {
//                sp_row_list.add(i);
                num_row++;
            }
        }

        for (int i = 0; i < mat[0].length; i++) {
            int sum_col = 0;

            for (int j = 0; j < mat.length; j++) {
                sum_col += mat[j][i];
            }
            if(sum_col == 1) {
                num_col++;
            }
        }
        System.out.println();

        return Math.min(num_row, num_col);


    }
}
