package alevel.com.delivery_food.logic;

import alevel.com.delivery_food.data.type_food.Pizza;
import alevel.com.delivery_food.data.Recipe;

import java.util.HashMap;

public class Chef extends Cook {

    private Stock stock;
    private Recipe recipePizza = new Recipe();

    public Chef(Stock stock) {
        this.stock = stock;

    }

    @Override
    public void cookHawaiian() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.HAWAIIAN);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookMargarita() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.MARGARITA);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookSeasons() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.SEASONS);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookMomMia() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.MOM_MIA);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookMexican() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.MEXICAN);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookPepperoni() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.PEPPERONI);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookVegetarian() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.VEGETARIAN);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookHunting() {
        HashMap<String, Integer> recipe = recipePizza.recipe(Pizza.HUNTING);

        if(isAvailableFood(stock, recipe)) {
            takeFromStock(stock, recipe);
        }
    }

    @Override
    public void cookBaltimore() {

    }

    @Override
    public void cookRainbow() {

    }

    @Override
    public void cookMorocco() {

    }

    @Override
    public void cookVerona() {

    }

    @Override
    public void cookPharaoh() {

    }

    @Override
    public void cookSunrise() {

    }

    @Override
    public void cookUnagiTempura() {

    }
}
