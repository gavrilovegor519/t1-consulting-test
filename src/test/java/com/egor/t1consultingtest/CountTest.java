package com.egor.t1consultingtest;

import com.egor.t1consultingtest.service.CountService;
import com.egor.t1consultingtest.service.impl.CountServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountTest {
    private final CountService countService = new CountServiceImpl();

    @Test
    public void test1() {
        Map<Character, Integer> charMap = countService.count("aaaaabcccc");

        assertEquals(charMap.get('a'), 5);
        assertEquals(charMap.get('b'), 1);
        assertEquals(charMap.get('c'), 4);
    }

    @Test
    public void test2() {
        Map<Character, Integer> charMap = countService.count("");

        assertTrue(charMap.isEmpty());
    }
}
