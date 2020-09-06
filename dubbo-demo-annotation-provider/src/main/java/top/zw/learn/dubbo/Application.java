package top.zw.learn.dubbo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.zw.learn.dubbo.config.Configuration;
import top.zw.learn.dubbo.service.AnnotationService;
import top.zw.learn.dubbo.service.impl.AnnotationServiceImpl;

/**
 * @program: learnDubbo
 * @description: Application
 * @author: bonsoirzw
 * @create: 2020-09-05 16:31
 **/
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        context.start();
        AnnotationService service = context.getBean("annotationService", AnnotationServiceImpl.class);
        String hello = service.sayHello("world");
        System.out.println("result :" + hello);
    }
}
