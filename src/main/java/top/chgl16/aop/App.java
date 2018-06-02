package top.chgl16.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("top/chgl16/aop/beans.xml");

        TestServiceInter ts = (TestServiceInter) ac.getBean("proxyFactoryBean");   // 接口了
        ts.sayHello();
        ((TestServiceInter2)ts).sayBye();

    }
}
