package top.zw.learn.dubbo.demo;

import java.util.concurrent.CompletableFuture;

/**
 * @program: learnDubbo
 * @description: DemoService
 * @author: bonsoirzw
 * @create: 2020-08-30 19:27
 **/
public interface DemoService {
    String sayHello(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
