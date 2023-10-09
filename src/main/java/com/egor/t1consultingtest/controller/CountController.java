package com.egor.t1consultingtest.controller;

import com.egor.t1consultingtest.service.CountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
public class CountController {
    private final CountService countService;

    @PostMapping("/count")
    public Map<Character, Integer> count(@RequestBody String string) {
        return countService.count(string);
    }
}
