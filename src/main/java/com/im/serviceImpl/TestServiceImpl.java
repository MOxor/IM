package com.im.serviceImpl;

import com.im.mapper.TestMapper;
import com.im.entity.TestObject;
import com.im.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: im
 * @description: 测试服务接口实现类
 * @author: MO_or
 * @create: 2020-04- 11:10
 **/
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;


    @Override
    public int insert(TestObject testObject) {
        return testMapper.insert(testObject);
    }
}
