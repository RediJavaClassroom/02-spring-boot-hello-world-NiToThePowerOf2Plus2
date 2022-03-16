package com.redi.demo.controller;

import com.redi.demo.domain.GreetingStatistic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class GreetingStatisticController {
    @GetMapping("statistic")
    public HashMap<String, Integer> showGreetingStatistic(){
        return GreetingStatistic.getList();
    }

}









