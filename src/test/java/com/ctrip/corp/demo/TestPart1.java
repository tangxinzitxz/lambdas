package com.ctrip.corp.demo;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class TestPart1 {
    @Test
    public void functionalStringsWithNumbers() {

        List<String> beginningWithNumbers
                = Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());

        assertEquals(asList("1abc"), beginningWithNumbers);
    }
}
