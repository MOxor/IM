package com.im.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: im
 * @description: 数据源实体类
 * @author: MO_or
 * @create: 2020-05- 15:16
 **/
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "spring.datasource.druid") //扫描配置类的属性前缀
public class DruidDataSourceProperties {

    private String username;
    private String password;
    private String url;
    private String driverClassName;
    private Integer initialSize;
    private Integer maxActive;
    private Integer minIdle;
    private long maxWait;
    private boolean poolPreparedStatements;
    private Integer timeBetweenEvictionRunsMillis;
    private Integer minEvictableIdleTimeMillis;
    private String validationQuery;
    private boolean testWhileIdle;
    private boolean testOnBorrow;
    private boolean testOnReturn;
    private String filters;
    private Integer maxPoolPreparedStatementPerConnectionSize;
    private boolean useGlobalDataSourceStat;
    private String connectionProperties;

}
