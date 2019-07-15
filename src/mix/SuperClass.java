package mix;

public class SuperClass {
    public static String superStaticField = "superStaticField";

    static {
        System.out.println("super static block code");
    }

    public static void superStaticMethod() {
        System.out.println("super static method");
    }

    public String superField = "superField";

    SuperClass() {
        System.out.println("super constructor");
    }

    {
        System.out.println("super block code");
    }

    public void superMethod() {
        System.out.println("super method");
    }

}
