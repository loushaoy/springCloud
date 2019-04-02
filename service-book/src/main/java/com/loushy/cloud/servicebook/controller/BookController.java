package com.loushy.cloud.servicebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BookController {

    @RequestMapping("/book")
    public String index(@RequestParam String name){
        return "Book say hello to "+name;
    }

    @RequestMapping("/books")
    public Map index(@RequestParam String name,@RequestParam int age){
        Map map = new HashMap();
        map.put("name",name);
        map.put("age",age);
        return map;
    }
}
