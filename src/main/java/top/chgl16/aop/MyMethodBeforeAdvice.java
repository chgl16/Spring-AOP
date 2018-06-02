package top.chgl16.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * method: 被调用的方法
 * object 被代理的对象
 * object[] 给method传递的参数
 */

/**
 * 这是要被织入代理对象的类（代理对象只需要配置）
 * 这里面的功能就是切面
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("记录日志..." + method.getName() + " "  + " " + o);

    }
}
