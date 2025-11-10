package com.taoge.filesystem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FileController {

    private Logger logger = LoggerFactory.getLogger(FileController.class);

    /**
     * 获取服务器时间（主要用于测试前后端通信）
     *
     * @return
     */
    @ResponseBody
    @GetMapping("/test")
    public String getTime() {
        long time = System.currentTimeMillis() / 1000;
        logger.info("获取当前时间戳:" + time);
        return time + "";
    }


}
