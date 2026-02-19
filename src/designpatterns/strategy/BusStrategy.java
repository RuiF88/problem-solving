package designpatterns.strategy;

public class BusStrategy implements TransportStrategy{
    @Override
    public void transport() {
        System.out.println("I'm travelling by bus and it's so cheap");
    }
}
