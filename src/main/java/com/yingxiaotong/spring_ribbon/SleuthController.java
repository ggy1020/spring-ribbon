package com.yingxiaotong.spring_ribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private  SleuthService sleuthService;

    @GetMapping("/same-span")
    public String helloSleuthSameSpan() throws InterruptedException {
        logger.info("Same Span");
        sleuthService.doSomeWorkSameSpan();
        return "success";
    }

}
