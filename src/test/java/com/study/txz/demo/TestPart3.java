package com.study.txz.demo;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

/**
 * Created by tangxz on 2018-03-19.
 */
public class TestPart3 {

    @Test
    public void TestFilterList() {

        List<String> filterList = Stream.of("tang", "1tangxz", "tangxinzi")
                .filter(x -> isDigit(x.charAt(0)))
                .collect(toList());

        assertEquals(asList("1tangxz"), filterList);
    }

    @Test
    public void TestMapList() {

        List<String> filterList = Stream.of("tang", "tangxz", "tangxinzi")
                .map(x -> x.toUpperCase())
                .collect(toList());

        assertEquals(asList("TANG", "TANGXZ", "TANGXINZI"), filterList);
    }

    @Test
    public void TestflatMapList() {

        List<String> flatMapList = Stream.of(asList("tang", "xin", "zi"), asList("tangxinzi"))
                .flatMap(x -> x.stream())
                .collect(toList());

        assertEquals(asList("tang", "xin", "zi", "tangxinzi"), flatMapList);
    }

    @Test
    public void TestMaxOrMinList() {
        List<String> names = asList("tang", "xin", "zi");
        String shortestTrack = names.stream()
                .min(Comparator.comparing(x -> x.length()))
                .get();

        assertEquals(names.get(2), shortestTrack);

        shortestTrack = names.stream()
                .max(Comparator.comparing(x -> x.length()))
                .get();

        assertEquals(names.get(0), shortestTrack);
    }

    @Test
    public void TestReduce() {
        int count = Stream.of(1, 2, 3)
                .reduce(0, (tempValue, element) -> tempValue + element);
        assertEquals(6, count);

        Stream.of(10, 5, 3)
                .reduce(0, (tempValue, element) -> {
                    System.out.println(tempValue);
                    return tempValue + element;
                });


        String stringVla = Stream.of("222", "2", "3")
                .reduce("1", (tempValue, element) -> tempValue + element);
        stringVla.toUpperCase();
        System.out.println(stringVla);
    }

    @Test
    public void DebugLambda() {

        List<String> names = asList("唐信滋", "张三", "李四");

        names.stream().
                filter(name -> name.startsWith("张三")).
                peek(name -> {
                    return;
                }).
                map((x) -> "姓名：" + x).
                peek(name -> {
                    return;
                }).
                collect(toList());

    }
}
