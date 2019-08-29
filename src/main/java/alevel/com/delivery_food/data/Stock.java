package alevel.com.delivery_food.data;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("ALL")
@Getter
@Setter
public class Stock {

    public final static String TOMATO_SAUCE = "Tomato Sauce";
    public final static String MOZZARELLACHEESE = "Mozzarella cheese";
    public final static String PEPPERONI = "Pepperoni";
    public final static String HAM = "Ham";
    public final static String SALAMI = "Salami";
    public final static String CHAMPIGNON = "Champignon";
    public final static String BLACK_OLIVES = "Black olives";
    public final static String BACON = "Bacon";
    public final static String TOMATOES = "Tomatoes";
    public final static String GREENERY = "Greenery";
    public final static String SWEET_PEPPER = "Sweet pepper";
    public final static String JALEPENO_PEPPER = "Jalapeno pepper";
    public final static String ONION = "Onion";
    public final static String PINEAPPLES = "Pineapples";
    public final static String HUNTING_SAUSAGES = "Hunting sausages";
    public final static String PICKLED_CUCUMBERRS = "Pickled cucumbers";
    public final static String ZUCCHINI = "Zucchini";
    public final static String BELL_PEPPER = "Bell pepper";
    public final static String MUSHROOMS = "Mushrooms";
    public final static String OLIVES = "Olives";
    public final static String OLIVE_GARLIC_SAUCE = "Olive-garlic sauce";

    private HashMap<String, Integer> products = new HashMap<>();

    private final int nullProducts = 0;


    public Stock() {

        ArrayList<String> listName = nameProducts();

        for (int i = 0; i < listName.size(); i++) {
            products.put(listName.get(i), nullProducts);
        }
    }


    private ArrayList<String> nameProducts() {

        ArrayList<String> name = new ArrayList<String>();

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
