package com.huangyuanlove;

public class ReverseSentence {

    public static void main(String ... args){
        String test = "";
        System.out.println(ReverseSentence(test));
    }


    public static String ReverseSentence(String str) {

        if(str == null || str.trim().length() ==0){
            return str;
        }

        String[] splitResult = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = splitResult.length-1;i>=0;i--){
            sb.append(splitResult[i]);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        return  sb.toString();
    }
}
