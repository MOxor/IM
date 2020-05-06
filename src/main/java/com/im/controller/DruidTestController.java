package com.im.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @program: im
 * @description: 测试Druid
 * @author: MO_or
 * @create: 2020-05- 15:46
 **/
@RestController
public class DruidTestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/testJdbc")
    public List<Map<String, Object>> testJdbcTemplate() {
        List<Map<String, Object>> testList = jdbcTemplate.queryForList("select * from test");
        return testList;
    }
}
