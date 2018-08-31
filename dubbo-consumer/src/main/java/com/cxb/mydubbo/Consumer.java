package com.cxb.mydubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 81046 on 2018-08-31
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DubboService demoService = context.getBean(DubboService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }
}
