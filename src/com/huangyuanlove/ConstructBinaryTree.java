package com.huangyuanlove;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ConstructBinaryTree {


    public static void main(String... args) {
        int pre[] = {1, 2, 4, 7, 3, 5, 6, 8};
        int in[] = {4, 7, 2, 1, 5, 3, 8, 6};

        TreeNode result = reConstructBinaryTree(pre, in);
        printTreeNode(result);

    }

    static void printTreeNode(TreeNode treeNode) {

        if (treeNode != null) {
            printTreeNode(treeNode.left);
            printTreeNode(treeNode.right);
            System.out.println(treeNode.val);
        }

    }


    static public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length != in.length)//如果先序或者中序数组有一个为空的话，就无法建树，返回为空
            return null;
        else {
            return reBuildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }
    }

    static private TreeNode reBuildTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn)//先对传的参数进行检查判断
            return null;
        int root = pre[startPre];//数组的开始位置的元素是跟元素
        int locateRoot = locate(root, in, startIn, endIn);//得到根节点在中序数组中的位置 左子树的中序和右子树的中序以根节点位置为界
        if (locateRoot == -1) //在中序数组中没有找到跟节点，则返回空
            return null;
        TreeNode treeRoot = new TreeNode(root);//创建树根节点
        treeRoot.left = reBuildTree(pre, startPre + 1, startPre + locateRoot - startIn, in, startIn, locateRoot - 1);//递归构建左子树
        treeRoot.right = reBuildTree(pre, startPre + locateRoot - startIn + 1, endPre, in, locateRoot + 1, endIn);//递归构建右子树
        return treeRoot;
    }

    //找到根节点在中序数组中的位置，根节点之前的是左子树的中序数组，根节点之后的是右子树的中序数组
    static private int locate(int root, int[] in, int startIn, int endIn) {
        for (int i = startIn; i <= endIn; i++) {
            if (root == in[i])
                return i;
        }
        return -1;
    }

}
