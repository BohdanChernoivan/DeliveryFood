package alevel.com.delivery_food.logic;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

import static alevel.com.delivery_food.data.Products.*;

@Getter
@Setter
public class Stock {


    private HashMap<String, Integer> products = new HashMap<>();

    private final int nullProducts = 0;


    public Stock() {

        ArrayList<String> listName = nameProducts();

        for (String name : listName) {
            products.put(name, nullProducts);
        }
    }


    private ArrayList<String> nameProducts() {

        ArrayList<String> name = new ArrayList<>();

        name.add(TOMATO_SAUCE);
        name.add(MOZZARELLACHEESE);
        name.add(PEPPERONI);
        name.add(HAM);
        name.add(SALAMI);
        name.add(CHAMPIGNON);
        name.add(BLACK_OLIVES);
        name.add(BACON);
        name.add(TOMATOES);
        name.add(GREENERY);
        name.add(SWEET_PEPPER);
        name.add(JALEPENO_PEPPER);
        name.add(ONION);
        name.add(PINEAPPLES);
        name.add(HUNTING_SAUSAGES);
        name.add(PICKLED_CUCUMBERRS);
        name.add(ZUCCHINI);
        name.add(BELL_PEPPER);
        name.add(MUSHROOMS);
        name.add(OLIVES);
        name.add(OLIVE_GARLIC_SAUCE);

        return name;
    }
}
