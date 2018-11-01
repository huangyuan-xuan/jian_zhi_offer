package com.huangyuanlove;

import java.util.LinkedList;

/**
 * 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
 * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
 */
public class LastRemaining {
    public int LastRemaining_Solution(int n, int m) {

        if(m<=0 || n <=0){
            return -1;
        }


        LinkedList<Integer> children = new LinkedList<>();

        for(int i = 0;i<n;i++){
            children.add(i);
        }

        int index = -1;
        while (children.size() > 1) {
            index = (index + m) % children.size();
            children.remove(index);
            index--;
        }
        return children.get(0);
    }
}
