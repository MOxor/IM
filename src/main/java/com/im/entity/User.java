package com.im.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @program: im
 * @description: 用户实体类
 * @author: MO_or
 * @create: 2020-08-10 11:02
 **/
@ApiModel(value = "用户实体")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    @JsonIgnore
    @ApiModelProperty(name = "用户车辆",dataType = "Car" ,notes = "用户车辆")
    private Car car;

    public User(Integer userId, String userName, String password, String email, String birthDate) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.birthDate = birthDate;
    }

    @ApiModelProperty(name = "用户id", dataType = "Integer", notes = "用户id")
    private Integer userId;

    @ApiModelProperty(name = "用户名", dataType = "String", notes = "用户名")
    private String userName;

    @ApiModelProperty(name = "密码", dataType = "String", notes = "密码")
    private String password;

    @ApiModelProperty(name = "邮箱", dataType = "String", notes = "邮箱")
    private String email;

    @ApiModelProperty(name = "生日", dataType = "String", notes = "生日")
    private String birthDate;

}
