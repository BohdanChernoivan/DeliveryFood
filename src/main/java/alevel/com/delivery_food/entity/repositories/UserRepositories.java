package alevel.com.delivery_food.entity.repositories;

import alevel.com.delivery_food.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositories extends JpaRepository<User, UUID> {
}
