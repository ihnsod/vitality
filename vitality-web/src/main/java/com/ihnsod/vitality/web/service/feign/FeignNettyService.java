package com.ihnsod.vitality.web.service.feign;

import com.ihnsod.vitality.web.config.FeignConfig;
import com.ihnsod.vitality.web.service.feign.fallback.FeignNettyFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: Ihnsod
 * @create: 2019/04/08 23:12
 **/
@FeignClient(value = "netty", configuration = FeignConfig.class
        , fallback = FeignNettyFallback.class)
public interface FeignNettyService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello();
}
