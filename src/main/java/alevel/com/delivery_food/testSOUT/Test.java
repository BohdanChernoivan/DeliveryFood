package alevel.com.delivery_food.testSOUT;

import alevel.com.delivery_food.data.PizzaType;
import alevel.com.delivery_food.data.Stock;
import alevel.com.delivery_food.logic.Chef;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Stock stock = new Stock();
        stock.getProducts().put(Stock.TOMATO_SAUCE, 200);
        stock.getProducts().put(Stock.MOZZARELLACHEESE, 200);
        stock.getProducts().put(Stock.HAM, 200);
        stock.getProducts().put(Stock.PINEAPPLES, 200);

        Chef chef = new Chef(stock);
        chef.cookPizza(PizzaType.HAWAIIAN);

        List<String> fullNameProducts = new ArrayList<>(stock.getProducts().keySet());
        List<Integer> fullAvailableProducts = new ArrayList<>(stock.getProducts().values());

        for (int i = 0; i < fullNameProducts.size(); i++) {

            System.out.println(fullNameProducts.get(i));
            System.out.println(fullAvailableProducts.get(i));
        }
    }
}
