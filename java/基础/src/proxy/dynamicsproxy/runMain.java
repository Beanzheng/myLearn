package proxy.dynamicsproxy;

import java.lang.reflect.Proxy;

public class runMain {
    public static void main(String[] args) {
        //创建目标对象
        Object target = new UserDaoImpl();
        //创建事务处理器
        TransactionHandler handler = new TransactionHandler(target);
        //生成代理类并使用接口对其进行引用
        UserDao userDao = (UserDao) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
        userDao.save();
    }
}
/**
 * 总结：静态代理不能使一个代理类反复作用于多个目标对象，静态代理提高了程序之间的耦合
 *
 */
