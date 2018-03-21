package com.study.txz.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tangxz on 2018-03-19.
 */
public class Part4 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 500000; i++) {
            list.add((int) (Math.random() * 1000000));
        }

        long begin = System.currentTimeMillis();
        int sum = 0;

        sum = list.stream().reduce(0,(x, y) -> x + y);

        System.out.println("sum:" + sum);

        long end = System.currentTimeMillis();

        System.out.println("测试【Lambda】耗时：" + ((end - begin) / 1000.0) + "秒");


        long begin1 = System.currentTimeMillis();

        int sum1 = 0;
        for (Integer i : list) {
            sum1 += i;
        }
        System.out.println("sum1:" + sum1);
        long end1 = System.currentTimeMillis();

        System.out.println("测试【非Lambda】耗时：" + ((end1 - begin1) / 1000.0) + "秒");

    }
}
