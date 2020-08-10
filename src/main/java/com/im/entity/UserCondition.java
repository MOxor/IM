package com.im.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: im
 * @description: 模拟用户组合查询
 * @author: MO_or
 * @create: 2020-08-10 11:16
 **/
@ApiModel(value = "用户查询对象")
@Getter
@Setter
public class UserCondition {

    @ApiModelProperty(name = "用户id",dataType = "String" ,notes = "用户Id")
    private Integer userId;

    @ApiModelProperty(name = "用户名",dataType = "String" ,notes="用户名")
    private String userName;

}
