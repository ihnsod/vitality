package com.ihnsod.vitality.netty.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Ihnsod
 * @create: 2019/04/09 21:27
 **/
@Service
public class NettyService {
    @GetMapping("/hello")
    public String nettyService(){
        return "hello, i'm netty service!";
    }
}
