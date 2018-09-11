package com.huangyuanlove;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintTreeFromTopToBottom {

    public static void main(String... args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(10);
        TreeNode node11 = new TreeNode(11);


        node6.left = node5;
        node6.right = node7;

        node10.left = node9;
        node10.right = node11;

        node8.left = node6;
        node8.right = node10;

        System.out.println(PrintFromTopToBottom(node8));

    }


    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();


        linkedList.add(root);
        while (linkedList.size() > 0) {
            TreeNode node = linkedList.removeFirst();
            result.add(node.val);
            if (node.left != null) {
                linkedList.add(node.left);
            }
            if (node.right != null) {
                linkedList.add(node.right);
            }
        }

        return result;

    }

}
