package com.huangyuanlove;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class QueueWithTowStack {


    public static void main(String ... args){

    }

    static Stack<Integer> stack1 = new Stack<Integer>();
   static Stack<Integer> stack2 = new Stack<Integer>();

   static public void push(int node) {
            stack1.push(node);
    }

   static public int pop() {
       if(stack2.empty()) {
           while (!stack1.empty()) {
               stack2.push(stack1.pop());
           }
       }
       return stack2.pop();
    }

}
