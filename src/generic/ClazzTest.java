package generic;

public class ClazzTest {
    public static void main(String[] args) {
        GenClazz<Integer> genClazz = new GenClazz<>(123);
        GenClazz<String> strClazz = new GenClazz<>("abc");
        System.out.println(genClazz.getKey());
        System.out.println(strClazz.getKey());
        GenClazz randomClazz = new GenClazz(true);
        System.out.println(randomClazz.getKey());
    }
}
