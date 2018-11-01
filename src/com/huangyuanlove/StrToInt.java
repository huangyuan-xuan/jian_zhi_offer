package com.huangyuanlove;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class StrToInt {


    public static void main(String ... args){
        System.out.println(StrToInt("+12+3"));
    }


    public static int StrToInt(String str) {

        if (str == null || str.trim().length() == 0) {
            return 0;
        }

        if (str.length() == 1 && (str.charAt(0) == '-' || str.charAt(0) == '+')) {
            return 0;
        }

        int symble = -1;
        if (str.charAt(0) == '-') {
            symble = 1;
        }else if(str.charAt(0) == '+'){
            symble = 0;
        }else if( str.charAt(0) > 48 || str.charAt(0) < 57){
            symble = -1;
        }else{
            return 0;
        }


        int sum = 0;
        for (int i = symble>-1?1:0; i < str.length(); i++)
        {
            if (str.charAt(i) < 48 || str.charAt(i) > 57)
                return 0;
            sum = sum * 10 + str.charAt(i) - 48;
        }
        return symble == 1 ? sum * -1:sum;
    }
}
