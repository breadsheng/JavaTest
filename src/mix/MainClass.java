package mix;

public class MainClass extends SuperClass {
    public static String mainStaticField = "mainStaticField";

    static {
        System.out.println("main static block code");
    }

    public static void mainStaticMethod() {
        System.out.println("main static method");
    }


    public String mainField = "mainField";

    {
        System.out.println("main block code");
    }

    public void superMethod() {
        super.superMethod();
        System.out.println("main method");
    }

    MainClass() {
        System.out.println("main constructor");
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.superMethod();
    }
}