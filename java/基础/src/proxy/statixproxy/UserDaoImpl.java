package proxy.statixproxy;
//代理目标
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("正在保存。。。");
    }
}
