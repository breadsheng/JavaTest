import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class GetField {

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
    }

    public static void main(String[] args) {
        Animal animal = new Animal("breadsheng", 3);
        Class clazz = animal.getClass();
        for (Field field : clazz.getFields()) {
            print(field.getName());
        }
        for (Field field : clazz.getDeclaredFields()) {
            print(field.getName());
            print(field.getType().getName());
            print(Modifier.toString(field.getModifiers()));
            for (Annotation annotation: field.getAnnotations()) {
                print(annotation.annotationType().getName());
            }
        }
        print(animal.toString());
        try {
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);
            name.set(animal, "aaa");
            Field age = clazz.getDeclaredField("age");
            age.setInt(animal, 4);
            print(animal.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}
