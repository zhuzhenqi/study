package com.study.study.controller;

import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author zhuzhenqi
 * @date 2019/8/16 18:52
 */
public class TestController1 {
    public static void main(String[] args)throws Exception {
        StringBuilder sb = new StringBuilder();
        System.out.println(StringUtils.isEmpty(sb.toString()) );
        System.out.println(sb.toString());
    }

    private static String desc(String str) {
        if (StringUtils.isEmpty(str)) {
            return "-1";
        }
        StringBuilder sb = new StringBuilder();

        char[] chars = str.toCharArray();
        for (char c : chars) {
            if ((c>=48) && c <= 57) {
                sb.append(c);
            }
        }
        if (sb.toString().isEmpty()){
            return "-1";
        }
        String s = sb.toString();
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        StringBuilder newSb = new StringBuilder();
        for (char c : chars1) {
            newSb.append(c);
        }
        System.out.println(newSb.toString());
        return newSb.toString();
    }
}
