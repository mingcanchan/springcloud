package com.ming.controller;

import com.ming.service.impl.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class HiController {
    private HiService hiService;

    @Autowired
    public HiController(HiService hiService) {
        this.hiService = hiService;
    }

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "ming", required = false) String name) {
        return hiService.sayHi(name);
    }
}
