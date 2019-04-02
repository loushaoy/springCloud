package com.loushy.cloud.apibook.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign的特点：
 * 1.声明式REST客户端（伪RPC）
 * 2.采用了基于接口的注解。
 */

@FeignClient(value = "service-book") //要访问的服务名称
public interface FeignService {

    @GetMapping("/books")
    String sayBook(@RequestParam(name = "name") String name,@RequestParam(name = "age") Integer age);
}
