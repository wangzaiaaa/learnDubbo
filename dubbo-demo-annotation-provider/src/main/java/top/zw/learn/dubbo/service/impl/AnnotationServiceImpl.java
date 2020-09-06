package top.zw.learn.dubbo.service.impl;

import org.springframework.stereotype.Service;
import top.zw.learn.dubbo.service.AnnotationService;

/**
 * @program: learnDubbo
 * @description: AonotationServiceImpl
 * @author: bonsoirzw
 * @create: 2020-09-05 16:24
 **/
@Service("annotationService")
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello," + name;
    }
}
