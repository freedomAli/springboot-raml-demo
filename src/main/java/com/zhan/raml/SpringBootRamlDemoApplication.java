package com.zhan.raml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

/**
 * Created by zhanyanjun on 2018/5/4.
 */
@SpringBootApplication
public class SpringBootRamlDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRamlDemoApplication.class, args);
    }
}
