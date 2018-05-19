package proxy;

public class TargetObject implements TargetService {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }
}
