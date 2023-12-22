package com.egor.t1consultingtest.service;

import com.egor.t1consultingtest.dto.CountDto;

import java.util.Map;

public interface CountService {
    Map<Character, Integer> count(CountDto countDto);
}
