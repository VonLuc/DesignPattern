package demo.lazy;

public class President {
    private static volatile President install = null;
    private President() {
        System.out.println("产生一个总统");
    }
    public static synchronized President getInstance() {
        if(install == null) {
            install = new President();
        }else {
            System.out.println("已经产生一个总统，不能产生新总统");
        }
        return install;
    }

    public void getName() {
        System.out.println("i'm fucking Trump");
    }

}
