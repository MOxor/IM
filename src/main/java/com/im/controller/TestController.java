package com.im.controller;

import com.im.entity.TestObject;
import com.im.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @program: im
 * @description: 测试类api
 * @author: MO_or
 * @create: 2020-04- 11:12
 **/
@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/insert")
    public void createUser(TestObject testObject, HttpServletResponse response) throws IOException {
        log.info("info");
        log.debug("debug");
        log.error("error");
        testService.testSlf4j();
        // System.out.println(testService.insert(testObject));
        // System.out.println("test insert");
    }
}
