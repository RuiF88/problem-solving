package designpatterns.strategy;

public class CarStrategy implements TransportStrategy{

    @Override
    public void transport() {
        System.out.println("I'm travelling by car and it's so comfortable");
    }
}
