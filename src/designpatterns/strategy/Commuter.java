package designpatterns.strategy;

public class Commuter {
    private final TransportStrategy strategy;

    public Commuter(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToWork() {
        if (strategy == null) {
            throw new Error("Transport strategy not set");
        }
        strategy.transport();
    }


}
