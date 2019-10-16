package com.study.study.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zhuzhenqi
 * @date 2019/9/19 10:55
 */
public class aaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int temp = a[n - 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (a[i] < temp) {
                list.add(i);
            }
        }

        int aa, b, temp1;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                aa = list.get(j);
                b = list.get(j + 1);
                if (aa < b) {
                    list.set(j,b);
                    list.set(j+1,aa);
                    //注意：这里是把值设置到集合中去
                }
            }
        }
        for (int w = 0; w < list.size(); w++) {
            System.out.print(list.get(w)+" ");
        }
    }


}
