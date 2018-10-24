package com.huangyuanlove;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class FindFirstCommonNode {


    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = findListLength(pHead1);
        int len2 = findListLength(pHead2);

        if (len1 > len2) {
            pHead1 = walkStep(pHead1, len1 - len2);
        } else {
            pHead2 = walkStep(pHead2, len2 - len1);
        }
        while (pHead1 != null) {
            if (pHead1 == pHead2) return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }

    int findListLength(ListNode pHead1) {
        if (pHead1 == null) return 0;
        int sum = 0;
        while (pHead1 !=null) {
            pHead1 = pHead1.next;
            sum++;}
        return sum;
    }

    ListNode walkStep(ListNode pHead1, int step) {
        while (step-- > 0) {
            pHead1 = pHead1.next;
        }
        return pHead1;
    }

}
