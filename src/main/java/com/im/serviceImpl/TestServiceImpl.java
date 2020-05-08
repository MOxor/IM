package com.im.serviceImpl;

import com.im.mapper.TestMapper;
import com.im.entity.TestObject;
import com.im.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: im
 * @description: 测试服务接口实现类
 * @author: MO_or
 * @create: 2020-04- 11:10
 **/
@Slf4j
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public int insert(TestObject testObject) {
        return testMapper.insert(testObject);
    }

    @Override
    public void testSlf4j() {
        log.info("info");
        log.debug("debug");
        log.error("error");
    }
}
