package com.egor.t1consultingtest.service.impl;

import com.egor.t1consultingtest.service.CountService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountServiceImpl implements CountService {
    @Override
    public Map<Character, Integer> count(String string) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        return map;
    }
}
