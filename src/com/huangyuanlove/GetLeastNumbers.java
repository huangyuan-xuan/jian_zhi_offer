package com.huangyuanlove;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class GetLeastNumbers {

    public static void main(String ... args){

    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        if(input==null || input.length==0 || input.length<k){
            return result;
        }
        if(k>=input.length){
            for(int i : input){
                result.add(i);
                Collections.sort(result);
            }
        }else{


            for (int i = 0; i < k; i++) {
                for (int j = 0; j < input.length - i - 1; j++) {
                    if (input[j] < input[j + 1]) {
                        int temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                    }
                }
                result.add(input[input.length - i - 1]);
            }


        }



        return result;

    }

}
