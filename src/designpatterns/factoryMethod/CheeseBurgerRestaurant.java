package designpatterns.factoryMethod;

public class CheeseBurgerRestaurant extends AbstractRestaurant {
    @Override
    public Burger createBurger() {
        return new CheeseBurger();
    }
}
