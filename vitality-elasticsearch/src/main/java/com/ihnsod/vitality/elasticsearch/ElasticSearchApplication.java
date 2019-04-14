package com.ihnsod.vitality.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Ihnsod
 * @create: 2019/04/07 22:55
 **/
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ElasticSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchApplication.class);
    }
}
