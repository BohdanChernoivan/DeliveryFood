package alevel.com.delivery_food.data;

import java.util.HashMap;

public class Recipe {

    public HashMap<String, Integer> recipe(PizzaType pizzaType) {

        HashMap<String, Integer> recipe = new HashMap<>();

        switch (pizzaType) {
            case HAWAIIAN:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                recipe.put(Stock.HAM, 150);
                recipe.put(Stock.PINEAPPLES, 150);
                return recipe;
            case MARGARITA:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                return recipe;
            case SEASONS:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                recipe.put(Stock.HAM, 150);
                recipe.put(Stock.SALAMI, 150);
                recipe.put(Stock.CHAMPIGNON, 150);
                recipe.put(Stock.BLACK_OLIVES, 150);
                return recipe;
            case MOM_MIA:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                recipe.put(Stock.HAM, 150);
                recipe.put(Stock.CHAMPIGNON, 150);
                recipe.put(Stock.BACON, 150);
                recipe.put(Stock.TOMATOES, 150);
                recipe.put(Stock.GREENERY, 150);
                return recipe;
            case MEXICAN:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                recipe.put(Stock.BACON, 150);
                recipe.put(Stock.BELL_PEPPER, 150);
                recipe.put(Stock.JALEPENO_PEPPER, 150);
                recipe.put(Stock.ONION, 150);
                recipe.put(Stock.BLACK_OLIVES, 150);
                return recipe;
            case PEPPERONI:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                recipe.put(Stock.PEPPERONI, 150);
                return recipe;
            case VEGETARIAN:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                recipe.put(Stock.ZUCCHINI, 150);
                recipe.put(Stock.SWEET_PEPPER, 150);
                recipe.put(Stock.MUSHROOMS, 150);
                recipe.put(Stock.OLIVES, 150);
                recipe.put(Stock.OLIVE_GARLIC_SAUCE, 150);
                return recipe;
            case HUNTING:
                recipe.put(Stock.TOMATO_SAUCE, 150);
                recipe.put(Stock.MOZZARELLACHEESE, 150);
                recipe.put(Stock.HUNTING_SAUSAGES, 150);
                recipe.put(Stock.PICKLED_CUCUMBERRS, 150);
                recipe.put(Stock.BLACK_OLIVES, 150);
                recipe.put(Stock.JALEPENO_PEPPER, 150);
                recipe.put(Stock.ONION, 150);
                return recipe;
                default: return null;
        }

    }
}
