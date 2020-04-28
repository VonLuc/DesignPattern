package demo.lazy;

/**
 * 用懒汉式单例模式模拟产生美国当今总统对象
 *
 */
public class SingletonLazy {
    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();
        President zt2 = President.getInstance();
        zt2.getName();;
        if(zt1 == zt2) {
            System.out.println("same");
        }else {
            System.out.println("not the same one");
        }
    }
}
