package alevel.com.delivery_food.entity.repositories;

import alevel.com.delivery_food.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepositories extends JpaRepository<Inventory, String> {
}
