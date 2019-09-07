package alevel.com.delivery_food.controller;

import alevel.com.delivery_food.entity.Order;
import alevel.com.delivery_food.entity.User;
import alevel.com.delivery_food.entity.repositories.OrderRepositories;
import alevel.com.delivery_food.entity.repositories.UserRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("delivery_food/order")
public class OrderController {

    private final OrderRepositories orderRepositories;
    private final UserRepositories userRepositories;
    private boolean firstStringBuilder = true;

    public OrderController(OrderRepositories orderRepositories, UserRepositories userRepositories) {
        this.orderRepositories = orderRepositories;
        this.userRepositories = userRepositories;
    }

    //TODO
    @PostMapping("/user/add")
    public void addUser(@RequestBody User user) {

        if(user.getName() == null || user.getAddress() == null || user.getPassword() == null) {
            throw new RuntimeException("Enter name and try again");
        } else {

            userRepositories.save(user);

            Order order = new Order();
            order.setUser(user);
//
            StringBuilder stringOrder = new StringBuilder();

            if (firstStringBuilder) {
                firstStringBuilder = false;
                stringOrder.append(user.getProduct);
            } else {
                stringOrder.append(", ").append(user.getProduct);
            }

            order.setOrderFood(stringOrder.toString());
            orderRepositories.save(order);
        }
    }

    @GetMapping("/order/findAll")
    public List<Order> addOrder() {
        return orderRepositories.findAll();
    }
}
//    @PostMapping("/find_order")
//    public UUID showOrder(RequestBody User user) {
//
//        return orderRepositories.getOne(user.);
//    }



/*
  boolean firstStringBuilder = true;
for (String product : products) {
                if (firstStringBuilder) {
                    firstStringBuilder = false;
                    stringOrder.append(product);
                } else {
                    stringOrder.append(", ").append(product);
                }
            }

            order.setOrderFood(stringOrder.toString());*/