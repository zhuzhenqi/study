package com.study.study.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhuzhenqi
 * @date 2019/9/19 11:28
 */
public class bbb {

    public static void main(String[] args) {
        //假设用户输入的数已经放到一个集合中
        List<Integer> list = new ArrayList<>(4);
        list.add(-1);
        list.add(-3);
        list.add(2);
        list.add(3);
        //假如n=3
        //找出下标=3的元素
        Integer element = list.get(3);
        if (element != null) {
            List<Integer> newList = new ArrayList<>();
            for (Integer integer : list) {
                if (integer < element) {
                    newList.add(integer);
                }

            }
            if (newList.size()>0) {
                //你这里可以用冒泡去排序，我这边为了方便直接用api了
                Collections.sort(newList);
                Collections.reverse(newList);
                System.out.println(newList.toString());
            }
        }
    }
}
