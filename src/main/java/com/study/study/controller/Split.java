package com.study.study.controller;

/**
 * @author zhuzhenqi
 * @date 2019/10/14 9:40
 */
public class Split {
    static String s = "\"a\"";

    public static void main(String[] args) {
        String[] split = s.split("\"");
        System.out.println(split.toString());
        for (int i = 0; i < split.length; i++) {
            System.out.println(i);
            System.out.println(split[i]);
        }
    }
}
