package com.study.txz.demo;

import com.study.txz.biz.TestBiz;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by tangxz on 2018-03-21.
 */
public class TestPart4 {

    @Test
    public void TestToUpperCase() {
        List<String> input = asList("tang", "tangxz", "tangxinzi");

        List<String> result = TestBiz.toUpperCase(input);

        assertEquals(asList("TANG", "TANGXZ", "TANGXINZI"), result);
    }
}
