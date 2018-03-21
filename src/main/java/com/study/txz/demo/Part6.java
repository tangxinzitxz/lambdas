package com.study.txz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by tangxz on 2018-03-21.
 */
public class Part6 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 500000; i++) {
            list.add((int) (Math.random() * 1000000));
        }


        long begin = System.currentTimeMillis();

        list.stream().filter((i) -> (i % 2 == 0));

        long end = System.currentTimeMillis();

        System.out.println("测试【Lambda】耗时：" + ((end - begin) / 1000.0) + "秒");

        long begin1 = System.currentTimeMillis();

        list.stream().filter(new Predicate<Integer>(){
            @Override
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        });

        long end1 = System.currentTimeMillis();

        System.out.println("测试【非Lambda】耗时：" + ((end1 - begin1) / 1000.0) + "秒");
    }
}
