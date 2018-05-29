package generic;

public class InterfaceTest {

    public static void main(String[] args) {
        GenInterfaceImpl2 genInterfaceImpl2 = new GenInterfaceImpl2(111, "aaa");
        System.out.println(genInterfaceImpl2.getKey());
        System.out.println(genInterfaceImpl2.getValue());

        GenInterfaceImpl genInterface = new GenInterfaceImpl(222, "bbb");
        System.out.println(genInterface.getKey());
        System.out.println(genInterface.getValue());

        GenInterfaceImpl<String, Integer> genInterface1 = new GenInterfaceImpl<>("ccc", 333);
        System.out.println(genInterface1.getKey());
        System.out.println(genInterface1.getValue());

        GenInterfaceImpl<Object, ?> genInterface2 = new GenInterfaceImpl<>("ddd", 444);
        System.out.println(genInterface2.getKey());
        System.out.println(genInterface2.getValue());
    }
}
