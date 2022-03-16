package com.redi.demo.domain;

import java.util.HashMap;

public class GreetingStatistic {

    private static HashMap<String, Integer> list;

    static{
        list = new HashMap<String, Integer>();
    }

    public static HashMap<String, Integer> getList() {
        return GreetingStatistic.list;
    }

    public static void setList(HashMap<String, Integer> list) {
        GreetingStatistic.list = list;
    }
}

