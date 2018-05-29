package generic;

public class GenInterfaceImpl2 implements GenInterface<Integer, String> {

    Integer key;
    String value;

    public GenInterfaceImpl2(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Integer getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }
}
