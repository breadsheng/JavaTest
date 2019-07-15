package pattern;

public class Singleton {
    private static Singleton singleton1;

    public static Singleton getInstance1() {
        if (null == singleton1) {
            synchronized (Singleton.class) {
                if (null == singleton1) { // 可能存在问题
                    singleton1 = new Singleton();
                }
            }
        }
        return singleton1;
    }


    private volatile static Singleton singleton2;

    public static Singleton getInstance2() {
        if (null == singleton2) {
            synchronized (Singleton.class) {
                return singleton2 = new Singleton();
            }
        }
        return singleton2;
    }


    private static class SingletonHolder {
        public static Singleton singleton3 = new Singleton();
    }

    public static Singleton getInstance3() {
        return SingletonHolder.singleton3;
    }
}
