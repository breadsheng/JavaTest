import java.util.HashSet;
import java.util.Set;

public class GetClass {

    enum E { A, B}

    public static void main(String[] args) {
        // 1. Object.getClass()通过对象实例获取，基本类型无法使用
        Class a = "foo".getClass();
        Class b = E.A.getClass();
        for (Object s : b.getEnumConstants()) {
            System.out.println(s);
        }
        System.out.println(b.isEnum());
        byte[] byteArray = new byte[100];
        Class c = byteArray.getClass();
        Set<String> set = new HashSet<>();
        Class d = set.getClass();
//        boolean bool;
//        bool.getClass();
        // 2. the .class syntax通过类型获取，基本类型也可以
        Class e = String.class;
        Class f = boolean.class;
        // 3. Class.forName()全限定名获取，基本类型无法使用
        try {
            Class g = Class.forName("java.lang.String");
            Class h = Class.forName("[D");// double[].class
            Class i = Class.forName("[Ljava.lang.String");// String[].class
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        // 4. TYPE field for primitive type wrapper基本类型和void类型的包装类可以用TYPE获取
        Class j = Double.TYPE;
        Class k = Void.TYPE;
        // 5. Methods that returns Class
        Class l = a.getDeclaringClass();

    }
}
