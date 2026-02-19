package designpatterns.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class CheeseBurger implements Burger {

    private final List<String> ingredients = new ArrayList<>();

    @Override
    public void prepare() {
        ingredients.add("Bread");
        ingredients.add("Meat");
        ingredients.add("Cheese");
    }

    public void getIngredients(){
        System.out.println("CheeseBurger Ingredients: ");
        ingredients.forEach(System.out::println);
    }
}
