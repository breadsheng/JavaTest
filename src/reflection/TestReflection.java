package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflection {
    static class Animal {
        private String name;
        private int age;
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
        Class clazz = Animal.class;
        try {
            Constructor constructor = clazz.getConstructor(String.class, int.class);
            Animal animal = (Animal) constructor.newInstance("breadsheng", 2);
            System.out.println(animal.toString());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
