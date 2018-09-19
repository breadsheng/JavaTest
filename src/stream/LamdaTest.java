package stream;

public class LamdaTest {
    public static void main(String[] args) {
        // lamda express here is an implement of functional interface.
        LamdaType lamdaType = (s) -> System.out.println(s);
        lamdaType.doSomething("breadsheng");
    }
}
