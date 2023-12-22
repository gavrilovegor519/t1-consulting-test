package com.egor.t1consultingtest.controller;

import com.egor.t1consultingtest.dto.CountDto;
import com.egor.t1consultingtest.service.CountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CountController {
    private final CountService countService;

    @PostMapping("/count")
    public Map<Character, Integer> count(@RequestBody CountDto countDto) {
        return countService.count(countDto);
    }
}
