package com.ming.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;


/**
 * @author chenmingcan
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer() {
//        100毫秒间隔,重试时间1秒,重试次数5
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
