package com.ihnsod.vitality.web.service.feign.fallback;

import com.ihnsod.vitality.web.service.feign.FeignElasticsearchService;
import org.springframework.stereotype.Component;

/**
 * @author: Ihnsod
 * @create: 2019/04/08 23:20
 **/
@Component
public class FeignElasticsearchFallback implements FeignElasticsearchService {

    @Override
    public String hello() {
        return "sorry, es not to say hello !";
    }
}
