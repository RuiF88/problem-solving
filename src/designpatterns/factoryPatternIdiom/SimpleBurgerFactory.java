package designpatterns.factoryPatternIdiom;

public class SimpleBurgerFactory {

    // this one violates open close principle, we have to change code to add or remove more burguer
    public Burger createBurger(String type) {
        switch (type) {
            case "NORMAL_BURGER":
                NormalBurger normalBurger = new NormalBurger();
                normalBurger.prepare();
                return normalBurger;
            case "CHEESE_BURGER":
                CheeseBurger cheeseBurger = new CheeseBurger();
                cheeseBurger.prepare();
                return cheeseBurger;
            default:
                return null;
        }
    }
}
