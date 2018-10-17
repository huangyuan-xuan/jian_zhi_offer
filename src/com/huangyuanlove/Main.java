package com.huangyuanlove;

public class Main {

    public static void main(String[] args) {


        System.out.println(getResut(0));
    }



    static int getResut(int raw){
        try {
            int reuslt = 1/raw;
            return 1;
        }catch (Exception e){
            System.out.println("Exception");
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("finally");
        }
    }

}
