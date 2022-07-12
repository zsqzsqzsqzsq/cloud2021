package com.zheng.springcloud.controller;

import com.zheng.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @author: zsq
 * @date: 2022年04月11日 10:38
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    private String sendMessage(){
        return messageProvider.send();
    }

}
