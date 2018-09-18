package com.huangyuanlove;

public class VerifySquenceOfBST {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length==0){
            return false;
        }
        if(sequence.length==1)
            return true;
        return verify(sequence, 0, sequence.length-1);
    }


    public boolean verify(int[] a,int star,int root){
        if(star>=root)
            return true;
        int i = root;
        //从后面开始找
        while(i>star&&a[i-1]>a[root])
            i--;//找到比根小的坐标
        //从前面开始找 star到i-1应该比根小
        for(int j = star;j<i-1;j++)
            if(a[j]>a[root])
                return false;
        return verify(a,star,i-1)&&verify(a, i, root-1);
    }
}
