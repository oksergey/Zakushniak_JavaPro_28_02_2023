package com.hillel.zakushniak.lessons;

import java.util.HashMap;
import java.util.Map;

public class TaskHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        System.out.println(map.put("hello", 12));
        System.out.println(map.put("hello", 1222));

        System.out.println(map);

    }
}
