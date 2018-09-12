package com.huangyuanlove;

/**
 * 连续子数组的最大和
 */
public class GreatestSumOfSubarrays {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==1){
            return array[0];
        }

        int result = array[0];
        int currentSum=0;
        for(int i = 0;i<   array.length;i++){
            if(currentSum<0){
                currentSum = array[i];
            }else{
                currentSum += array[i];
            }
            if(currentSum>result){
                result = currentSum;
            }
        }


        return result;

    }
}
