package annotation;

import java.lang.reflect.Field;

public class RuntimeAnnotationTest {
    @RuntimeAnnotation("breadsheng")
    private String name;

    public static void main(String[] args) {
        RuntimeAnnotationTest test = new RuntimeAnnotationTest();
        Class clazz = test.getClass();
        try {
            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            RuntimeAnnotation runtimeAnnotation = field.getAnnotation(RuntimeAnnotation.class);
            print(runtimeAnnotation.value());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void print(String msg) {
        System.out.print(msg);
    }
}
