package com.ming.service;

import com.ming.config.FeignConfig;
import com.ming.config.HiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenmingcan
 */
//value 远程调用的服务名称 configuration 配置信息
@FeignClient(value = "eureka-client", configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {

    /**
     * feign调用
     *
     * @param name 名称
     * @return
     */
    @GetMapping("/hi")
    String sayHiFromClientEureka(@RequestParam("name") String name);
}
