package alevel.com.delivery_food.logic;

import alevel.com.delivery_food.data.PizzaType;
import alevel.com.delivery_food.data.Recipe;
import alevel.com.delivery_food.data.Stock;
import alevel.com.delivery_food.logic.menu_food.CookPizza;

import java.util.HashMap;

public class Chef extends Cook implements CookPizza {

    private Stock stock;
    private Recipe recipePizza = new Recipe();

    public Chef(Stock stock) {
        this.stock = stock;

    }

    @Override
    public void cookHawaiian() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.HAWAIIAN);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookMargarita() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.MARGARITA);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookSeasons() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.SEASONS);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookMomMia() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.MOM_MIA);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookMexican() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.MEXICAN);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookPepperoni() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.PEPPERONI);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookVegetarian() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.VEGETARIAN);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookHunting() {
        HashMap<String, Integer> recipe = recipePizza.recipe(PizzaType.HUNTING);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }
}
