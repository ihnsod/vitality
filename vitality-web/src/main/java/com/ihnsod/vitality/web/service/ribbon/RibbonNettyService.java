//package com.ihnsod.vitality.web.service.ribbon;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
///**
// * @author: Ihnsod
// * @create: 2019/04/10 23:49
// **/
//@Service
//public class RibbonNettyService {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @HystrixCommand(fallbackMethod = "nettyErrorSayHello")
//    public String sayHello() {
//        return restTemplate.getForEntity("http://netty/hello", String.class).getBody();
//    }
//
//    public String nettyErrorSayHello() {
//        return "sorry, netty not to say hello ";
//    }
//}
