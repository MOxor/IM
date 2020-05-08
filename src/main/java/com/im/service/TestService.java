package com.im.service;

import com.im.mapper.TestMapper;
import com.im.entity.TestObject;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: im
 * @description: 测试下lombok
 * @author: MO_or
 * @create: 2020-04- 16:01
 **/
@Slf4j
public class TestService {

    @Resource
    private TestMapper testMapper;

    public static void main(String[] args) {

//        TestObject testObject = new TestObject();
//
//        testObject.setId("1");
//        testObject.setTestContent("1");

//        System.out.println(testObject.toString());

        // >> 位运算符
//        int a = 9 >> 1;
//        int b = 10 >> 2;
//        System.out.println(a);
//        System.out.println(b);

        // int数据类型最大最小值
//        int c = Integer.MAX_VALUE;
//        int d = Integer.MIN_VALUE;
//        int e = Integer.MAX_VALUE - 8;
//        int f = Integer.MIN_VALUE - 8;
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);

        // 线程安全的arrayList
//        List arr = Collections.synchronizedList(new ArrayList<>());
//        arr.add(1);
//
//        System.out.println(arr);

        List arr = new ArrayList();
        List arr1 = new ArrayList(12);
        // List arr2 = new ArrayList(-1);
        arr.add(1);
        arr1.add(2);
        // arr2.add(3);
        arr.add(1);

        log.info("info");
        log.debug("debug");
        log.error("error");

    }
}
