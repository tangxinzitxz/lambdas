package com.study.txz.biz;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by tangxz on 2018-03-21.
 */
public class TestBiz {

    /**
     * 全部转成大写
     * @param words
     * @return
     */
    public static List<String> toUpperCase(List<String> words) {
        return words.stream()
                .map(string -> string.toUpperCase())
                .collect(toList());
    }
}
