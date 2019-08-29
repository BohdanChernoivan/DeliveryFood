package alevel.com.delivery_food.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Abstract class")
class CookTest {
    private Cook cook = new Cook() {
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

        @Override
        public void cookHawaiian() {

        }

        @Override
        public void cookMargarita() {

        }

        @Override
        public void cookSeasons() {

        }

        @Override
        public void cookMomMia() {

        }

        @Override
        public void cookMexican() {

        }

        @Override
        public void cookPepperoni() {

        }

        @Override
        public void cookVegetarian() {

        }

        @Override
        public void cookHunting() {

        }

        @Override
        protected boolean isAvailableFood(Stock stock, HashMap<String, Integer> recipe) {
            return super.isAvailableFood(stock, recipe);
        }
    };
    private HashMap<String, Integer> hashMap;
    private Stock stock;

    @BeforeEach
    void setUp() {
        hashMap = new HashMap<>();
        String access = "Access";
        hashMap.put(access,5);
        stock = new Stock();
        stock.getProducts().put(access, 5);
    }

    @Test
    void availableFood() {
        assertTrue(cook.isAvailableFood(stock,hashMap));
    }
}