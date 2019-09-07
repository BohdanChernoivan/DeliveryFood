package alevel.com.delivery_food.entity.repositories;

import alevel.com.delivery_food.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MenuRepositories extends JpaRepository<Menu, UUID> {
}
