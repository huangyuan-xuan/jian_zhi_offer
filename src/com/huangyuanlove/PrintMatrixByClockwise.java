package com.huangyuanlove;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1    2   3   4
 * 5    6   7   8
 * 9    10  11  12
 * 13   14  15  16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * <p>
 * <p>
 * 4    8   12  16
 * 3    7   11  15
 * 2    6   10  14
 * 1    5   9   13
 */

import java.util.ArrayList;

public class PrintMatrixByClockwise {


    public static void main(String... args) {

        int [][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printMatrix(matrix));

    }


    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();

        int row=matrix.length;//行数
        int column=matrix[0].length;//列数
        //计算打印的圈数
        int circle=((row<column?row:column)-1)/2+1;//圈数
        for(int i=0;i<circle;i++){
            //从左向右打印
            for(int j=i;j<column-i;j++)
                result.add(matrix[i][j]);
            //从上往下的每一列数据
            for(int k=i+1;k<row-i;k++)
                result.add(matrix[k][column-1-i]);
            //判断是否会重复打印(从右向左的每行数据)
            for(int m=column-i-2;(m>=i)&&(row-i-1!=i);m--)
                result.add(matrix[row-i-1][m]);
            //判断是否会重复打印(从下往上的每一列数据)
            for(int n=row-i-2;(n>i)&&(column-i-1!=i);n--)
                result.add(matrix[n][i]);}
        return result;

    }


}
