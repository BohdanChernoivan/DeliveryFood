package alevel.com.delivery_food.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {
    private Stock stock;

    @BeforeEach
    void setUp() {
        stock = new Stock();
    }

    @Test
    void getProducts() {
        assertEquals(43, stock.getProducts().size(), "Don't have products in stock");
    }
}