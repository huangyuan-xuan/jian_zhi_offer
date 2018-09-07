package com.huangyuanlove;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 两个指针同时指向头部，第一个指针先走k-1步，然后两个指针一块走，直到第一个指针走到头
 */
public class FindKthToTail {


    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode target = head;
        ListNode pre = head;
        for (int i = 1; i < k; i++) {
            if (pre.next != null) {
                pre = pre.next;
            }else{
                return null;
            }
        }


        while (pre.next != null) {
            pre = pre.next;
            target = target.next;
        }
        if(k == 0){
            target = target.next;
        }
        return target;


    }


}
