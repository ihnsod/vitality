//package com.ihnsod.vitality.web.service.ribbon;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
///**
// * @author: Ihnsod
// * @create: 2019/04/10 23:48
// **/
//@Service
//public class RibbonElasticsearchService {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @HystrixCommand(fallbackMethod = "esErrorSayHello")
//    public String sayHello() {
//        return restTemplate.getForEntity("http://elasticsearch/hello", String.class).getBody();
//    }
//
//    public String esErrorSayHello() {
//        return "sorry, es not to say hello ";
//    }
//}
