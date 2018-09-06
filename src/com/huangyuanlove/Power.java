package com.huangyuanlove;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 注意一下负数
 * 求一个数的32次方，可以先求它的16次方，然后求平方
 */
public class Power {

public static void main(String ... args){

    System.out.println(Power(2,-3));

}


   static public double Power(double base, int exponent) {

        double result = getResult(base,Math.abs(exponent));
        if(exponent <0){
            result = 1/result;
        }
        return  result;


    }

    static double getResult(double base, int exponent){
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double result = getResult(base, exponent >> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            result *= base;
        }

        return  result;
    }

}
