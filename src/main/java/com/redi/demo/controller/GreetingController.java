package com.redi.demo.controller;

import com.redi.demo.domain.Greeting;
import com.redi.demo.domain.GreetingStatistic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
//each method in this class will map to an endpoint
public class GreetingController {

    //to get auto incrementing id
    private AtomicLong counter = new AtomicLong();


    //get endpoint
    @GetMapping("greeting")


    public Greeting greet(@RequestParam(value = "name", defaultValue = "World") String name){

        //statistic part
        
        //if key found add new (name,0)
        GreetingStatistic.getList().putIfAbsent(name,0);
        //increment by 1
        GreetingStatistic.getList().put(name,GreetingStatistic.getList().get(name)+1);


        String content = "Hello, "+name+" !";
        return new Greeting(counter.incrementAndGet(),content);
    }





}
