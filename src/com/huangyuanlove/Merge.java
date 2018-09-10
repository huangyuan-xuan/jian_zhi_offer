package com.huangyuanlove;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge {



    public static void main(String ... args){

        ListNode one1 = new ListNode(1);
        ListNode one5 = new ListNode(5);
        ListNode one7 = new ListNode(7);
        ListNode one9 = new ListNode(9);
        one1.next = one5;
        one5.next = one7;
        one7.next = one9;

        ListNode two2= new ListNode(2);
        ListNode two3= new ListNode(3);
        ListNode two4= new ListNode(4);
        ListNode two10= new ListNode(10);
        two2.next = two3;
        two3.next = two4;
        two4.next = two10;


        ListNode result = Merge(one1,two2);
       while (result!=null){
           System.out.print(result.val +" ");
           result = result.next;
       }




    }


     static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode head = new ListNode(-1);
        head.next=null;
        ListNode root=head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                head.next = list1;
                head = list1;
                list1 = list1.next;

            } else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        //把未结束的链表连接到合并后的链表尾部
        if(list1!=null){
            head.next=list1;
        }
        if(list2!=null){
            head.next=list2;
        }
        return root.next;


    }
}
