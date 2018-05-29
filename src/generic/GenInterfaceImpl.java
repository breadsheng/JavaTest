package generic;

public class GenInterfaceImpl<K, V> implements GenInterface<K, V> {

    K key;
    V value;

    public GenInterfaceImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
