package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;

public class GetClassInfo {

    public static void main(String[] args) {
        Class clazz = HashMap.class;
        print(clazz.getCanonicalName());
        print(clazz.getTypeName());
        print(Modifier.toString(clazz.getModifiers()));
        for (TypeVariable tv : clazz.getTypeParameters()) {
            print(tv.getName());
        }
        for (Class cls : clazz.getInterfaces()) {
            print(cls.getName());
        }
        for (Type type : clazz.getGenericInterfaces()) {
            print(type.getTypeName());
        }
        for (Annotation annotation : clazz.getAnnotations()) {
            print(annotation.toString());
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}
