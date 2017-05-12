package org.lightfor.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 配置类
 * Created by Light on 2017/5/11.
 */
@SpringBootApplication
public class ReadingListApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);
    }
}
