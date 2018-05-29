package generic;

public class GenClazz<T> {
    private T key;

    public GenClazz(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
