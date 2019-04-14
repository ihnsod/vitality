package com.ihnsod.vitality.web.service.feign.fallback;

import com.ihnsod.vitality.web.service.feign.FeignNettyService;
import org.springframework.stereotype.Component;

/**
 * @author: Ihnsod
 * @create: 2019/04/08 23:21
 **/
@Component
public class FeignNettyFallback implements FeignNettyService {

    @Override
    public String hello() {
        return "sorry, netty not to say hello !";
    }
}
