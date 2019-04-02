package com.loushy.cloud.apibook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class BookService {

    @Autowired
    RestTemplate restTemplate;



    public Map bookSay(String name){
//        restTemplate.getForObject("http://SERVICE-BOOK/book?name="+name,String.class)
        return restTemplate.getForObject("http://SERVICE-BOOK/books?name="+name+"&age=12",Map.class)  ;
    }
}
