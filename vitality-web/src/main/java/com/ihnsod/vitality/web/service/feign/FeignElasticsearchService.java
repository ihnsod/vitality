package com.ihnsod.vitality.web.service.feign;

import com.ihnsod.vitality.web.config.FeignConfig;
import com.ihnsod.vitality.web.service.feign.fallback.FeignElasticsearchFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Ihnsod
 * @create: 2019/04/08 23:12
 **/
@FeignClient(value = "elasticsearch", configuration = FeignConfig.class
        , fallback = FeignElasticsearchFallback.class)
public interface FeignElasticsearchService {

    @GetMapping("/hello")
    String hello();
}
