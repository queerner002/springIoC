package com.依赖注入实现.属性构造方法;

import com.Model.Car1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/1/24 0024.
 */
public class Main {
    @Test
    public void fun(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        Car1 car = (Car1)applicationContext.getBean("car1");
        System.out.println(car);
        car.display();
    }
}
