package com.huangyuanlove;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {

    public static void main(String ... args){
       System.out.println(fibonacci(5));
    }


    static int fibonacci(int n) {

        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }
}
