package alevel.com.delivery_food.repositories;

import alevel.com.delivery_food.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepositories extends JpaRepository<Inventory, String> {
}
