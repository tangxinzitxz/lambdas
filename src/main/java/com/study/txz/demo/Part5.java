package com.study.txz.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by tangxz on 2018-03-21.
 */
public class Part5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 500000; i++) {
            list.add((int) (Math.random() * 1000000));
        }

        long begin = System.currentTimeMillis();

        list.sort( Comparator.comparingInt(x->x));

        long end = System.currentTimeMillis();

        System.out.println("测试【Lambda】耗时：" + ((end - begin) / 1000.0) + "秒");


        long begin1 = System.currentTimeMillis();

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        long end1 = System.currentTimeMillis();

        System.out.println("测试【非Lambda】耗时：" + ((end1 - begin1) / 1000.0) + "秒");
    }
}
