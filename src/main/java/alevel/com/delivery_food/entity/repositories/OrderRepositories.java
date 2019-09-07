package alevel.com.delivery_food.entity.repositories;

import alevel.com.delivery_food.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepositories extends JpaRepository<Order, UUID> {
}
