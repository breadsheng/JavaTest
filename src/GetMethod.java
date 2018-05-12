import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod {

    static class Animal {

        private String name;

        @Deprecated
        public int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + age;
        }

        private String getName(String name) {
            print(name);
            return name;
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("breadsheng", 3);
        Class clazz = animal.getClass();
        try {
            Method method = clazz.getDeclaredMethod("getName", String.class);
            method.setAccessible(true);
            method.invoke(animal, "test");
            Field ageField = clazz.getField("age");
            print(ageField.getAnnotatedType().getType().getTypeName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}
