package designpatterns.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class NormalBurger implements Burger {

    private final List<String> ingredients = new ArrayList<>();

    @Override
    public void prepare() {
        ingredients.add("Bread");
        ingredients.add("Meat");
        ingredients.add("Lettuce");
    }

    public void getIngredients(){
        System.out.println("NormalBurger Ingredients: ");
        ingredients.forEach(System.out::println);
    }
}
