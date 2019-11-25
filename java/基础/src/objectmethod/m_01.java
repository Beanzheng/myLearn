package objectmethod;

public class m_01 {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        o="2";
//        o.wait();
//        o.notify();
//        o.notifyAll();
//        o.hashCode();
        System.out.println(o.hashCode());
        System.out.println(o.toString());
        System.out.println(o.equals(2));
        System.out.println(o.getClass());
    }

}
