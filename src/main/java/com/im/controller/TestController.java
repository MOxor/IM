package com.im.controller;

import com.im.entity.TestObject;
import com.im.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    private String s12 = "s11";

    private final String s11 = s12;

    @RequestMapping(value = "/insert")
    public void createUser(TestObject testObject, HttpServletResponse response) throws IOException {


        /**
         * 测试SLF4J
         */
//                log.info("info");
//                log.debug("debug");
//                log.error("error");
//                testService.testSlf4j();


        /**
         * 测试final修饰成员变量
         */
//        System.out.println(s11);


        /**
         * 测试equals()
         * 测试String显示声明的两种方式的区别
         */
    //        String s = "hi";
    //        String s4 = "hi";
    //        s+="world";
    //        String s1 = new String("hi");
    //        String s3 = new String("hi");
    //        TestObject testObject1 = new TestObject();
    //        TestObject testObject2 = new TestObject();
    //        testObject1.equals(testObject2);
    //        String s2 = "hi";
    //        System.out.println(s);
    //        System.out.println(s == s1);
    //        System.out.println(s1 == s2);
    //        System.out.println(s == s2);
    //        System.out.println(s.equals(s2));
    //        System.out.println(s1.equals(s3));
    //        System.out.println(s.equals(s1));
    //        System.out.println(s.contains(s1));
    //        System.out.println(s.equals(s4));


        /**
         * 测试Mybatis是否生效
         */
        testObject.setId("1");
        testObject.setTestContent("123");
         System.out.println(testService.insert(testObject));
         System.out.println("test insert");


        /**
         * 测试HashMap的常用API
         * 测试遍历的几种方式
         * 1. 迭代器
         * 2. for
         * 3. for each
         * 4. lambad
         */
//        HashMap<String, String> testHashMap = new HashMap();
//        testHashMap.put("1","C");
//        testHashMap.put("2","C++");
//        testHashMap.put("3","C#");
//        testHashMap.put("4",".net");
//        testHashMap.put("5","go");
//        testHashMap.put("6","Java");
//        Set<Map.Entry<String, String>> entries = testHashMap.entrySet();
//        System.out.println(testHashMap);
//        System.out.println(entries);
//        Set<String> strings = testHashMap.keySet();
//        System.out.println(strings);

        /**
         * 测试lambad表达式
         * 适用场景？
         */
//        Runnable runnable2 = () -> System.out.println("test lambad");


    }


}
