package designpatterns.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class NormalBurgerRestaurant extends AbstractRestaurant{
    @Override
    public Burger createBurger() {
        return new NormalBurger();
    }
}
