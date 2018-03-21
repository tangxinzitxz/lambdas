package com.study.txz.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

/**
 * Created by tangxz on 2018-03-19.
 */
public class Part3 {
    public static void main(String[] args) {
        List<String> list = Stream.of("tang", "tangxz", "tangxinzi", "唐信滋").collect(Collectors.toList());

        Stream<String> stringStream = list.stream().filter(x -> {
                    System.out.println("执行语句");
                    return "tang".equals(x);
                }
        );

        System.out.println("执行完成");
        System.out.println("----------------------------------------分割线------------------------------------");
        long num = list.stream().filter(x -> {
                    System.out.println("执行语句");
                    return "tang".equals(x);
                }
        ).count();

        System.out.println("姓唐的人数：" + num);

        System.out.println("执行完成");


        List<String> mapList = Stream.of("tang", "tangxz", "tangxinzi")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());

        List<String> filterList = Stream.of("tang", "1tangxz", "tangxinzi")
                .filter(x -> isDigit(x.charAt(0)))
                .collect(Collectors.toList());
    }

}
