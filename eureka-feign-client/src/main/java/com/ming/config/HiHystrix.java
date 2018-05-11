package com.ming.config;

import com.ming.service.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @author chenmingcan
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi, " + name + " sorry,error!";
    }
}
