package com.ihnsod.vitality.web.controller.rpc;

import com.ihnsod.vitality.web.service.feign.FeignElasticsearchService;
import com.ihnsod.vitality.web.service.feign.FeignNettyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Ihnsod
 * @create: 2019/04/09 21:29
 **/
@RestController
@RequestMapping("/rpc")
public class RPCController {

    @Autowired
    private FeignNettyService feignNettyService;

    @Autowired
    private FeignElasticsearchService feignElasticsearchService;

//    @Autowired
//    private RibbonElasticsearchService ribbonElasticsearchService;
//
//    @Autowired
//    private RibbonNettyService ribbonNettyService;

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/netty")
    public String getNettyHello(){
        return feignNettyService.hello();
    }

    @GetMapping("/es")
    public String getEsHello(){
        return feignElasticsearchService.hello();
    }

    @GetMapping("/services")
    public String getAllServices(){
        return client.getServices().toString();
    }

//    @GetMapping("/ribbonEs")
//    public String ribbonEs(){
//       return ribbonElasticsearchService.sayHello();
//    }
//
//    @GetMapping("ribbonNetty")
//    public String ribbonNetty(){
//        return ribbonNettyService.sayHello();
//    }
}
