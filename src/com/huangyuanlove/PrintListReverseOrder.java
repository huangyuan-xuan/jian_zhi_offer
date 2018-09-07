package com.huangyuanlove;

import java.util.ArrayList;

public class PrintListReverseOrder {
static ArrayList<Integer> result = new ArrayList<>();
    public static void main(String args[]) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        System.out.println(printListFromTailToHead(listNode1));
    }

    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
     */
    static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {


        if (listNode != null) {
            if (listNode.next != null)
                printListFromTailToHead(listNode.next);
            result.add(listNode.val);
        }

        return result;


    }

}

