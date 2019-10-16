package com.study.study.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhuzhenqi
 * @date 2019/8/16 15:31
 */
public class TestController {
    private static final int maxScore = 100;

    public static void main(String[] args) {

        String b = "aaa";
        String a = new String("aaa");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a);
        System.out.println(b);
        //模拟3个学生参加考试分数随机生成【0,100】
        List<Integer> total = new ArrayList<>(3);
        ThreadLocalRandom current = ThreadLocalRandom.current();
        for (int i = 0; i < 3; i++) {
            total.add(current.nextInt(0, 100));
        }
        System.out.println(total.toString());
        int count = TestController.count(total, 60);
        System.out.println(count);
        System.out.println(total.toString());

    }

    public static int count(List<Integer> total, int x) {
        int sum = total.stream().mapToInt(score -> score).sum();
        int count = 0;
        while (sum / total.size() < x) {
            int min = total.stream().mapToInt(score -> score).min().getAsInt();
            ListIterator<Integer> integerListIterator = total.listIterator();
            if (integerListIterator.hasNext()){
                Integer next = integerListIterator.next();
                if (next .equals(min)) {
                    boolean remove = total.remove(next);
                    System.out.println(total.toString());
                    boolean add = total.add(maxScore);
                    System.out.println(total.toString());
                }
            }
            sum = sum + maxScore - min;
            count++;

        }

        return count;
    }
}
