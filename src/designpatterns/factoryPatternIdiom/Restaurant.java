package designpatterns.factoryPatternIdiom;

public class Restaurant {

    public Burger orderBurger(String type){
        SimpleBurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
        return simpleBurgerFactory.createBurger(type);
    }
}
