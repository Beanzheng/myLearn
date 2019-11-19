package proxy.dynamicsproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理对象
public class TransactionHandler implements InvocationHandler {
    Object target;
    public TransactionHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用目标方法前的处理
        System.out.println("开启事务控制...");
        //调用目标对象的方法
        Object result = method.invoke(target, args);
        //调用目标方法后的处理
        System.out.println("关闭事务控制...");
        return result;
    }
}
/**
 * 因此动态代理才真正的将代码中横向切面的逻辑剥离了出来，起到代码复用的目的。
 * 但是动态代理也有缺点，一是它的实现比静态代理更加复杂也不好理解；二
 * 是它存在一定的限制，例如它要求需要代理的对象必须实现了某个接口；
 * 三是它不够灵活，动态代理会为接口中的声明的所有方法添加上相同的代理逻辑。
 * 当然，这只是JDK动态代理所存在的一些缺陷，动态代理还有另外的实现如使用CGLIB库，在
 * 本文不做介绍，读者可以自行去了解。
 */
