package com.study.txz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by tangxz on 2018-03-19.
 */
public class Part3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("tang");
        list.add("tangxz");
        list.add("tangxinzi");
        list.add("唐信滋");

        Stream<String> stringStream =  list.stream().filter(x -> {
                    System.out.println("执行语句");
                    return "tang".equals(x);
                }
        );

        System.out.println("执行完成");
//        long num = list.stream().filter(x -> {
//                    System.out.println("执行语句");
//                    return "tang".equals(x);
//                }
//        ).count();
//
//        System.out.println("姓唐的人数：" + num);
    }
}
