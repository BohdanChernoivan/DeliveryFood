package alevel.com.delivery_food.controller;

import alevel.com.delivery_food.entity.Order;
import alevel.com.delivery_food.entity.User;
import alevel.com.delivery_food.entity.repositories.OrderRepositories;
import alevel.com.delivery_food.entity.repositories.UserRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("delivery_food/order")
public class OrderController {

    private final OrderRepositories orderRepositories;
    private final UserRepositories userRepositories;

    public OrderController(OrderRepositories orderRepositories, UserRepositories userRepositories) {
        this.orderRepositories = orderRepositories;
        this.userRepositories = userRepositories;
    }

    @PostMapping("/user/add")
    public void addUser(@RequestBody User user, List<String> products) {
        userRepositories.save(user);

        Order order = new Order();
        order.setUser(user);
//
        StringBuilder stringOrder = new StringBuilder();

        boolean firstStringBuilder = true;

        for (String product : products) {
            if(firstStringBuilder) {
                firstStringBuilder = false;
                stringOrder.append(product);
            } else {
                stringOrder.append(", ").append(product);
            }
        }

        orderRepositories.save(order);
    }

    @GetMapping("/order/findAll")
    public List<Order> addOrder() {
        return orderRepositories.findAll();
    }

//    @PostMapping("/find_order")
//    public UUID showOrder(RequestBody User user) {
//
//        return orderRepositories.getOne(user.);
//    }

}
