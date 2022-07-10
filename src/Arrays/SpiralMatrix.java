package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> al = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int total = row * col;
        int count = 0;

        // initialise the indexes;
        int startRow = 0;
        int endCol = col - 1;
        int endRow = row - 1;
        int startCol = 0;

        while(count < total){

            //print startRow
            for(int i = startCol; count < total && i <= endCol; i++){
                al.add(matrix[startRow][i]);
                count++;
            }
            startRow++;

            // print lastCol
            for(int i = startRow; count < total && i <= endRow; i++){
                al.add(matrix[i][endCol]);
                count++;
            }
            endCol--;

            // print lastRow

            for(int i = endCol; count < total && i >= startCol; i--){
                al.add(matrix[endRow][i]);
                count++;
            }
            endRow--;

            // print firstCol

            for(int i = endRow; count < total && i >= startRow; i--){
                al.add(matrix[i][startCol]);
                count++;
            }
            startCol++;
        }
        al.forEach((i)->{
            System.out.print(i+" ");
        });

    }
}
