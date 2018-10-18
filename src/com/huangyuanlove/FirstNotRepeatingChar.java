package com.huangyuanlove;

import java.util.LinkedHashMap;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {

        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        for(int i = 0 ; i < str.length();i++){
            linkedHashMap.put(str.charAt(i),linkedHashMap.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i = 0 ;i < str.length();i++){
            if(linkedHashMap.getOrDefault(str.charAt(i),0) == 1){
                return i;
            }
        }

        return -1;
    }
}
