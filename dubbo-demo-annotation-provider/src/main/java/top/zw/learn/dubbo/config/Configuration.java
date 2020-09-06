package top.zw.learn.dubbo.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


/**
 * @program: learnDubbo
 * @description: config
 * @author: bonsoirzw
 * @create: 2020-09-05 16:26
 **/
@org.springframework.context.annotation.Configuration
@EnableDubbo(scanBasePackages = "top.zw.learn.dubbo.service.impl")
@PropertySource("classpath:/dubbo-provider.properties")
@ComponentScan("top.zw.learn.dubbo.service")
public class Configuration {
}
