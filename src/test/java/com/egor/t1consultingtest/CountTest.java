package com.egor.t1consultingtest;

import com.egor.t1consultingtest.dto.CountDto;
import com.egor.t1consultingtest.service.CountService;
import com.egor.t1consultingtest.service.impl.CountServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountTest {
    private static final CountService countService = new CountServiceImpl();

    @Test
    public void test1() {
        CountDto countDto = new CountDto("aaaaabcccc");
        Map<Character, Integer> charMap = countService.count(countDto);

        assertEquals(charMap.get('a'), 5);
        assertEquals(charMap.get('b'), 1);
        assertEquals(charMap.get('c'), 4);
    }

    @Test
    public void test2() {
        CountDto countDto = new CountDto("");
        Map<Character, Integer> charMap = countService.count(countDto);

        assertTrue(charMap.isEmpty());
    }
}
