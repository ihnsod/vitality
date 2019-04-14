package com.ihnsod.vitality.elasticsearch.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Ihnsod
 * @create: 2019/04/09 21:23
 **/
@Service
public class ElasticsearchTestService {

    @GetMapping("/hello")
    public String ESService(){
        return "hello, i'm es service !";
    }
}
