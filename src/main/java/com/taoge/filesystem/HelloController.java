package com.taoge.filesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;


@Controller
@SpringBootApplication
public class HelloController {

    /**
     * springboot启动类
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }

}