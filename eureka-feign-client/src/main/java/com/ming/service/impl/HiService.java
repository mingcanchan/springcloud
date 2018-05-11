package com.ming.service.impl;

import com.ming.service.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenmingcan
 */
@Service
public class HiService {

    private EurekaClientFeign eurekaClientFeign;

    @Autowired
    public HiService(EurekaClientFeign eurekaClientFeign) {
        this.eurekaClientFeign = eurekaClientFeign;
    }

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
