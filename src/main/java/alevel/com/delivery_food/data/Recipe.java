package alevel.com.delivery_food.data;

import alevel.com.delivery_food.data.type_food.Pizza;

import java.util.HashMap;

import static alevel.com.delivery_food.data.Products.*;

public class Recipe {

    public HashMap<String, Integer> recipe(Pizza pizzaType) {

        HashMap<String, Integer> recipe = new HashMap<>();

        switch (pizzaType) {
            case HAWAIIAN:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                recipe.put(HAM, 150);
                recipe.put(PINEAPPLES, 150);
                return recipe;
            case MARGARITA:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                return recipe;
            case SEASONS:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                recipe.put(HAM, 150);
                recipe.put(SALAMI, 150);
                recipe.put(CHAMPIGNON, 150);
                recipe.put(BLACK_OLIVES, 150);
                return recipe;
            case MOM_MIA:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                recipe.put(HAM, 150);
                recipe.put(CHAMPIGNON, 150);
                recipe.put(BACON, 150);
                recipe.put(TOMATOES, 150);
                recipe.put(GREENERY, 150);
                return recipe;
            case MEXICAN:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                recipe.put(BACON, 150);
                recipe.put(BELL_PEPPER, 150);
                recipe.put(JALEPENO_PEPPER, 150);
                recipe.put(ONION, 150);
                recipe.put(BLACK_OLIVES, 150);
                return recipe;
            case PEPPERONI:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                recipe.put(PEPPERONI, 150);
                return recipe;
            case VEGETARIAN:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                recipe.put(ZUCCHINI, 150);
                recipe.put(SWEET_PEPPER, 150);
                recipe.put(MUSHROOMS, 150);
                recipe.put(OLIVES, 150);
                recipe.put(OLIVE_GARLIC_SAUCE, 150);
                return recipe;
            case HUNTING:
                recipe.put(TOMATO_SAUCE, 150);
                recipe.put(MOZZARELLACHEESE, 150);
                recipe.put(HUNTING_SAUSAGES, 150);
                recipe.put(PICKLED_CUCUMBERRS, 150);
                recipe.put(BLACK_OLIVES, 150);
                recipe.put(JALEPENO_PEPPER, 150);
                recipe.put(ONION, 150);
                return recipe;
                default: return null;
        }

    }
}
