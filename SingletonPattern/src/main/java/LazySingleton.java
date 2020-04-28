/**
 * 懒汉单例
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;//make sure instance synchronized in all threads
    private LazySingleton() {}//private 避免类在外部被实例化
    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
