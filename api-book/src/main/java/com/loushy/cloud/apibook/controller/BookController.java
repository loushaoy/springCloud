package com.loushy.cloud.apibook.controller;

import com.loushy.cloud.apibook.service.BookService;

import com.loushy.cloud.apibook.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class BookController {

    @Resource
    BookService bookService;

    @Resource
    FeignService feignService;

    @RequestMapping("/hello")
    public Map index(String name){
       return bookService.bookSay(name); //使用restTemplate
    }

    @RequestMapping("/book")
    public String bookIndex(String name){
        return feignService.sayBook(name,23); //使用feign
    }
}
