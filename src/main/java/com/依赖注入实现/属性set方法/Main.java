package com.依赖注入实现.属性set方法;

import com.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/1/24 0024.
 */
public class Main {
    @Test
    public void fun(){
        System.out.println("test测试");
        ApplicationContext applicationCtontext = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
        UserService cs = (UserService) applicationCtontext.getBean("cs");
        cs.save();
    }

}
