package com.ihnsod.vitality.elasticsearch.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Ihnsod
 * @create: 2019/04/10 22:54
 **/
@RestController
public class EsComputeController {

    private Logger logger = LoggerFactory.getLogger(EsComputeController.class);

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/hello")
    public String sayHello() {
        logger.info(client.getServices().toString());
        return "hello, i'm elasticsearch service!";
    }
}
