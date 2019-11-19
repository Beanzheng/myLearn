package proxy.statixproxy;

public class runMain {
    public static void main(String[] args) {
        //创建目标对象
        UserDaoImpl target =new UserDaoImpl();
        //创建代理对象
        UserDao userDao = new TransactionHandler(target);
        userDao.save();
    }
}
/**
 * 总结：静态代理不能使一个代理类反复作用于多个目标对象，静态代理提高了程序之间的耦合
 *
 */
