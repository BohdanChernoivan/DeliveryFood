package alevel.com.delivery_food.logic;

import alevel.com.delivery_food.data.Stock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("JUnit 5")
class CookTest {
    private Cook cook = new Cook() {
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