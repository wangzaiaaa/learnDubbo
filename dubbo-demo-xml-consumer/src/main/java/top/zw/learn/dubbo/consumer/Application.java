package top.zw.learn.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.zw.learn.dubbo.demo.DemoService;

/**
 * @program: learnDubbo
 * @description: Application
 * @author: bonsoirzw
 * @create: 2020-08-30 20:22
 **/
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();
        DemoService demoService = context.getBean("demoService", DemoService.class);
        String res = demoService.sayHello("hahaha0");
        System.out.println("result: " + res);
    }
}

