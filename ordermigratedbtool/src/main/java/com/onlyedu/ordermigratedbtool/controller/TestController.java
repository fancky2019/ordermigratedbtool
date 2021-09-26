package com.onlyedu.ordermigratedbtool.controller;

import com.onlyedu.ordermigratedbtool.model.dto.EosOrderDto;
import com.onlyedu.ordermigratedbtool.model.pojo.MessageResult;
import com.onlyedu.ordermigratedbtool.model.pojo.PageData;
import com.onlyedu.ordermigratedbtool.model.vo.EosOrderVo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private final static Logger logger = LogManager.getLogger(TestController.class);
    @GetMapping("/helloworld")
    public String helloworld(String hello) {
        logger.info("info");
        logger.error("error");
        logger.debug("debug");

        return "admin:"+hello+" - 6";
    }


    @GetMapping("/tagone")
    public String tagOne(String hello) {

        return "tagOne";
    }

    @GetMapping("/tagtwo")
    public String tagTwo(String hello) {

        return "tagTwo";
    }

    @GetMapping("/tagthree")
    public String tagThree(String hello) {

        return "tagThree";
    }
}
