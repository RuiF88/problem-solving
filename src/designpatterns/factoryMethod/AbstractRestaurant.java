package designpatterns.factoryMethod;

public abstract class AbstractRestaurant {
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    //THE factory method
    public abstract Burger createBurger();
}
