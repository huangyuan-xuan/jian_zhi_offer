package com.huangyuanlove;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);

        System.out.println(test);


        test.remove(0);
        System.out.println(test);


        test.add(5,7);
        System.out.println(test);
    }





}
