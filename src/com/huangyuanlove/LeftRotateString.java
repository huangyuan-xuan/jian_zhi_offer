package com.huangyuanlove;


/**
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 *
 * 三次反转字符串
 */

public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        n = n%len;

        str += str;
        return str.substring(n, len+n);


    }
}
