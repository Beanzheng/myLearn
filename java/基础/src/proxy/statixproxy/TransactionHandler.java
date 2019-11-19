package proxy.statixproxy;
//代理对象
public class TransactionHandler implements UserDao{
    private UserDaoImpl target;
    public TransactionHandler(UserDaoImpl target){
        this.target = target;
    }

    @Override
    public void save() {
        //调用目标方法前的处理
        System.out.println("开启事务控制...");
        //调用目标对象的方法
        target.save();
        //调用目标方法后的处理
        System.out.println("关闭事务控制...");
    }
}
