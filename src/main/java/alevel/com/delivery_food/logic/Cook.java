package alevel.com.delivery_food.logic;

import alevel.com.delivery_food.logic.menu_food.CookPizza;
import alevel.com.delivery_food.logic.menu_food.CookRolls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Cook implements CookPizza, CookRolls {

    void takeFromStock(Stock stock, HashMap<String, Integer> recipe) {

        List<String> nameProducts = new ArrayList<>(recipe.keySet());

        for (String name : nameProducts) {
            stock.getProducts().put(name, stock.getProducts().get(name)- recipe.get(name));
        }

    }

    protected boolean isAvailableFood(Stock stock, HashMap<String, Integer> recipe) {

        List<String> needProducts = new ArrayList<>(recipe.keySet());

        for (String needProduct : needProducts) {
            try {
                if (recipe.get(needProduct) > stock.getProducts().get(needProduct)) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Don't have products on stock");
            }
        }
        return true;
    }
}
