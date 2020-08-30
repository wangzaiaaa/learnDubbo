package top.zw.learn.dubbo.provider;

import org.apache.dubbo.rpc.RpcContext;
import top.zw.lean.dubbo.demo.DemoService;

import java.util.concurrent.CompletableFuture;

/**
 * @program: learnDubbo
 * @description: DemoServiceImpl
 * @author: bonsoirzw
 * @create: 2020-08-30 19:30
 **/
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        System.out.println("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public CompletableFuture<String> sayHelloAsync(String name) {
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            return "async result";
        });
        return cf;
    }
}
