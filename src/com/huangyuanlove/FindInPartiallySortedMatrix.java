package com.huangyuanlove;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * //  1   2   8   9
 * //  2   4   9   12
 * //  4   7   10  13
 * //  6   8   11  15
 */

public class FindInPartiallySortedMatrix {

    public static void main(String[] args){

        int [][]array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(19,array));
    }

    /**
     *
     * 从右上角开始查找，假设这个数是N，
     * 如果右上角的数大于target，则target在N的左边，只需要剔除N所在的列
     * 如果右上角的数小于target，则target在N的下边，只需要剔除N所在的行
     *
     */


    static boolean find(int target, int [][] array) {
        boolean isFound = false;
        if(array==null || array.length==0){
            return isFound;
        }


        int currentRow = 0;
        int currentColums = array[0].length-1;

        while(currentRow < array.length && currentColums>=0){
            if(array[currentRow][currentColums] == target){
                isFound = true;
                break;
            }else if(array[currentRow][currentColums] < target){
                currentRow ++;
            }else{
                currentColums --;
            }
        }

        return isFound;

    }

}
