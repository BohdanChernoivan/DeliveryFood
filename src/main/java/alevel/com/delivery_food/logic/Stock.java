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
        name.add(PINK_SALMON);
        name.add(MASAGO_CAVIAR);
        name.add(SESAME);
        name.add(CHUKA_SALAD);
        name.add(CREAM_CHEESE);
        name.add(CUCUMBER);
        name.add(OMELETTE);
        name.add(UNAGI_SAUCE);
        name.add(TOASTER_CHEESE);
        name.add(ACNE);
        name.add(SALMON);
        name.add(BUTTER_FILLET);
        name.add(GREEN_ONION);
        name.add(MAYONNAISE);
        name.add(CHICKEN_FILLET);
        name.add(SNOW_CRAB);
        name.add(UNAGI_PERCH);
        name.add(PANKO_CRACKERS);
        name.add(TEMPURA_BATTER);
        name.add(COCA_COLA);
        name.add(FANTA);
        name.add(SPRITE);


        return name;
    }
}
