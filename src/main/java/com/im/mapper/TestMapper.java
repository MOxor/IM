package com.im.mapper;

import com.im.entity.TestObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @program: im
 * @description: 测试数据层
 * @author: MO_or
 * @create: 2020-04- 17:54
 **/
@Mapper
public interface TestMapper {

    int insert(@Param("testObject")TestObject testObject);
}
