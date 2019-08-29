package alevel.com.delivery_food;

import alevel.com.delivery_food.logic.Stock;
import alevel.com.delivery_food.logic.Chef;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public final static String DONE_SERVICE = "DONE!";

    public Stock stock = new Stock();

    public Chef chef = new Chef(stock);


}
