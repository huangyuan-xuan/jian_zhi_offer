package com.huangyuanlove;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class MirrorBinaryTree {


    public static void main(String ... args){
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

        Mirror(node8);




    }


    public  static void Mirror(TreeNode root) {

        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            if(root.left!=null ){
                Mirror(root.left);
            }
            if(root.right!=null){
                Mirror(root.right);
            }
        }


    }

}

