package alevel.com.delivery_food.testSOUT;

import alevel.com.delivery_food.data.type_food.Pizza;
import alevel.com.delivery_food.logic.Stock;
import alevel.com.delivery_food.logic.Chef;

import java.util.ArrayList;
import java.util.List;

import static alevel.com.delivery_food.data.Products.*;

public class Test {
    public static void main(String[] args) {

        Stock stock = new Stock();
        stock.getProducts().put(TOMATO_SAUCE, 200);
        stock.getProducts().put(MOZZARELLACHEESE, 200);
        stock.getProducts().put(HAM, 200);
        stock.getProducts().put(PINEAPPLES, 200);

        Chef chef = new Chef(stock);
        chef.cookPizza(Pizza.HAWAIIAN);

        List<String> fullNameProducts = new ArrayList<>(stock.getProducts().keySet());
        List<Integer> fullAvailableProducts = new ArrayList<>(stock.getProducts().values());

        for (int i = 0; i < fullNameProducts.size(); i++) {

            System.out.println(fullNameProducts.get(i));
            System.out.println(fullAvailableProducts.get(i));
        }

        String n1 = "Hello";
        String n2 = "are";
        String n3 = "you";
        String n4 = "ready?";


        StringBuilder stringBuilder = new StringBuilder();

        List<String> hayr = new ArrayList<>();

        hayr.add(n1);
        hayr.add(n2);
        hayr.add(n3);
        hayr.add(n4);

        boolean wtf = true;

        for (String s: hayr) {
            if(wtf) {
                wtf = false;
                stringBuilder.append(s);
            } else
            stringBuilder.append(", ").append(s);
        }

        System.out.println(stringBuilder);
    }
}
