package com.huangyuanlove;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 */
public class StackWithMinNumber {

    private int minNumber = Integer.MAX_VALUE;
    private Stack<Integer> stack = new Stack<>();
    private ArrayList<Integer> minList = new ArrayList<>();

    public void push(int node) {
        stack.push(node);
        if (node < minNumber) {
            minNumber = node;
        }
        minList.add(minNumber);
    }

    public void pop() {


        minList.remove(minList.size()-1);
        minNumber = minList.get(minList.size()-1);
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minNumber;
    }
}
