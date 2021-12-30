package com.fei.text;

import com.fei.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =
                (UserService) applicationContext.getBean("userService",UserService.class);
        // 使用参数为Class类型,从容器中匹配Bean的实例
        // [注意],如果容器中有相同类型的多个Bean时,就会报错
/*        UserService userService1 = applicationContext.getBean(UserService.class);*/
        userService.saveUser();
    }


}
