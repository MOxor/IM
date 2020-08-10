package com.im;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.im.mapper")
@SpringBootApplication
@EnableSwagger2
public class ImApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ImApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}
