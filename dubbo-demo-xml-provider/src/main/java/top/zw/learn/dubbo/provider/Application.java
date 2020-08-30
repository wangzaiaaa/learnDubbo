package top.zw.learn.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: learnDubbo
 * @description: Application
 * @author: bonsoirzw
 * @create: 2020-08-30 19:36
 **/
public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring\\dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
