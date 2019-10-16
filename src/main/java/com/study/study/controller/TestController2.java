package com.study.study.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhuzhenqi
 * @date 2019/8/16 15:31
 */
@RestController
public class TestController2 {
    @GetMapping("{name}")
    public String test1(@PathVariable("name") String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {

            if (i%5==0){
                sb.append("<br/>") ;
            }
            sb.append(name+"我爱你哟!&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288");

        }
        return sb.toString();
    }
//    @GetMapping("{name}")
//    public String get(@PathVariable("name") String name) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1000; i++) {
//
//            if (i%5==0){
//                sb.append("<br/>") ;
//            }
//            sb.append(name+"真屌!&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288&#12288");
//
//        }
//        return sb.toString();
//    }
}
